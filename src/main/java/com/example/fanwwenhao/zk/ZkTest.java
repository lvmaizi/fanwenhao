package com.example.fanwwenhao.zk;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2020/7/24 18:11
 * @Version 1.0
 */
public class ZkTest {
    private static int inventory = 1;
    private static CountDownLatch countDownLatch = new CountDownLatch(10);
    private static ZkClient zkClient = new ZkClient("dev.zk-ha.yaoxinhd.io:2181");

    public static void main(String[] args) {
        //zkClient.createPersistent("/Lock");
        zkClient.delete("/Lock");
        for (int i = 0;i < 10;i ++){
            new Thread(()->{
                try {
                    countDownLatch.await();
                    if(inventory > 0){
                        TimeUnit.SECONDS.sleep(3);
                        inventory--;
                    }
                    System.out.println(inventory);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            countDownLatch.countDown();
        }
    }
    private static void waitForLock(){
        System.out.println("加锁失败");
        IZkDataListener iZkDataListener = new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {

            }

            @Override
            public void handleDataDeleted(String s) throws Exception {
                System.out.println("锁释放");
            }
        };
        zkClient.subscribeDataChanges("/Lock",iZkDataListener);
    }
}
