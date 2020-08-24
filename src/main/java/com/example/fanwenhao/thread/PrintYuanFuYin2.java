package com.example.fanwenhao.thread;


/**
 * @Date 2020/5/21 18:26
 * @Version 1.0
 */
public class PrintYuanFuYin2 {
    public volatile static char i = 'a';
    public static Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread threadY = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i<='z'){//任务结束运行的标志
                    synchronized (object){//抢到锁则执行
                        object.notify();
                       if(isYuan(i)){
                           System.out.println("元："+i++);
                       }
                       if(i<='z'){
                           try {
                               object.wait();
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                       }
                    }
                }
            }
        });
        Thread threadF = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i<='z'){//任务结束运行的标志
                    synchronized (object){//抢到锁则执行
                        object.notify();
                        if(!isYuan(i)){
                            System.out.println("福："+i++);
                        }
                        if(i<='z'){
                            try {
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        threadY.start();
        threadF.start();
        threadY.join();
        threadF.join();
    }
    public static boolean isYuan(char i){
        switch (i){
            case 'a': return true;
            case 'e': return true;
            case 'i': return true;
            case 'o': return true;
            case 'u': return true;
        }
        return false;
    }
}
