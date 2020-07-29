package com.example.fanwwenhao.zk;

import lombok.SneakyThrows;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/7/24 18:11
 * @Version 1.0
 */
public class ZkTest {
    private static int inventory = 10;
    private static ZkClient zkClient = new ZkClient("dev.zk-ha.yaoxinhd.io:2181");
    private static String path = "/Lock/o";
    private static ZkLock zkLock = new ZkLock();
    public static void main(String[] args) {
        zkClient.createEphemeral(path);
        String p = zkClient.createEphemeralSequential(path+ "/e","data");
        p = zkClient.createEphemeralSequential(path + "/","2");
        p = zkClient.createEphemeralSequential(path+ "/","2");
        List<String> l = zkClient.getChildren(path);
        System.out.println("s");
//        for (int i=0; i<10 ;i++){
//            new Thread(new Runnable(){
//                @Override
//                public void run() {
//                    try {
//                        zkLock.tryLock(path);
//                        inventory = inventory - 1;
//                        System.out.println(inventory);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }finally {
//                        zkLock.unLock(path);
//                    }
//                }
//            }).start();
//        }
    }

}
