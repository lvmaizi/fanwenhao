package com.example.fanwenhao.base.concurrence;

public class ShareUpdate1 {
    public static  int  share = 0;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (ShareUpdate1.class){
                        share = share + 2;
                        if(share == 200){
                            System.out.println(System.currentTimeMillis()-start);
                        }
                    }
                }
            }).start();
        }

    }

}
