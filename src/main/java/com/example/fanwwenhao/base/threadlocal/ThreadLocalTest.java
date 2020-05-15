package com.example.fanwwenhao.base.threadlocal;

/**
 * @Date 2020/5/13 15:07
 * @Version 1.0
 */
public class ThreadLocalTest {
    static int i=0;
    public static void main(String[] args) throws Exception{
        ThreadLocal<Integer> threadLocal = new ThreadLocal();
        for (i=0;i<100;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    threadLocal.set(i);
                    System.out.println(threadLocal.get());
                }
            });
            thread.start();
            thread.join();
        }
    }

    public void inheritableThreadLocal(){
        InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal();
    }
}
