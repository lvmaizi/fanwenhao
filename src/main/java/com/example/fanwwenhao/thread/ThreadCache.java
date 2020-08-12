package com.example.fanwwenhao.thread;

import java.util.concurrent.*;

/**
 * @Date 2020/6/3 16:26
 * @Version 1.0
 */
public class ThreadCache {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService t = Executors.newFixedThreadPool(3);
        Executors.newScheduledThreadPool(2);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newWorkStealingPool();
        Executors.newFixedThreadPool(3);
        ExecutorService executorService = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new SynchronousQueue<Runnable>(),new ThreadPoolExecutor.AbortPolicy());
        System.out.println("d");
        Future future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                TimeUnit.SECONDS.sleep(3);
                return "success";
            }
        });
        System.out.println("d1");
        Future future1 = null;
        try{
            future1 = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    TimeUnit.SECONDS.sleep(3);
                    return "success";
                }
            });
        }catch (Exception e){
            System.out.println("失败");
        }
        System.out.println("s1");
        System.out.println(future.get());
        System.out.println("s2");
        System.out.println(future1.get());

    }
}
