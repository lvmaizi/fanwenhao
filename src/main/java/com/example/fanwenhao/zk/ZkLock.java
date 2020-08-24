package com.example.fanwenhao.zk;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * @Date 2020/7/28 11:33
 * @Version 1.0
 */
public class ZkLock {
    private static ZkClient zkClient = new ZkClient("dev.zk-ha.yaoxinhd.io:2181");
    private boolean lock(String path){
        try {
            zkClient.createEphemeral(path);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public void tryLock(String path) throws InterruptedException {
        Semaphore semaphore = new Semaphore(0);
        String p = zkClient.createEphemeralSequential(path,"lock");
        System.out.println(p);
        List<String> l = zkClient.getChildren(path);
        Collections.sort(l);
        IZkDataListener iZkDataListener = new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {
            }
            @Override
            public void handleDataDeleted(String s) throws Exception {
                //尝试加锁
                semaphore.release();
            }
        };
        zkClient.subscribeDataChanges(path,iZkDataListener);
        while (true){
            try {
                if(p.equals(path+"/"+l.get(0))){
                    break;
                }
            }catch (Exception e){
                semaphore.acquire();
            }
        }
    }
    public void unLock(String path){
        zkClient.delete(path);
    }
}
