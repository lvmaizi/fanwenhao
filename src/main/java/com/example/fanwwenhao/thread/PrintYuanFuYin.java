package com.example.fanwwenhao.thread;

/**
 * @Date 2020/5/21 17:40
 * @Version 1.0
 */
public class PrintYuanFuYin {
    public static char i = 'a';
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        Thread threadY = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <='z'){
                    synchronized (o){
                        if(isYuan(i)){
                            System.out.println(Thread.currentThread().getName() + " " + i);
                            i++;
                        }
                    }
                }
            }
        });
        Thread threadF = new Thread(new Runnable() {
            @Override
            public void run() {
                while (i <='z'){
                    synchronized (o){
                        if(!isYuan(i)){
                            System.out.println(Thread.currentThread().getName() + " " + i);
                            i++;
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
