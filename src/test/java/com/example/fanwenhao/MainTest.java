package com.example.fanwenhao;

/**
 * @Author fanwenhao
 * @Date 2019/11/4 20:22
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader()
                .getResource(""));
        System.out.println(MainTest.class.getClassLoader()
                .getResource(""));
        System.out.println(String.class.getResource("/"));
        //JvmTest.main(new String[2]);
        System.out.println("888");
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread thread = new Thread(()->{
            ThreadGroup threadGroupq = Thread.currentThread().getThreadGroup();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tttt"+threadGroup.getName());
        });
        thread.start();
        System.out.println("jjj");
        throw new RuntimeException("sss");
    }
}
