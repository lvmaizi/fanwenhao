package com.example.fanwwenhao.thread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Date 2020/7/29 14:06
 * @Version 1.0
 */
public class MultInvoke {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        int b = 0;
        List<Future> rs = new ArrayList();
        for (int i = 0;i < 20; i++){
            int finalI = i;
            Future future = executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    return new MultInvoke().getInfo(String.valueOf(finalI));
                }
            });
            rs.add(future);
        }
        for (Future future:rs){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        System.out.println("kkk");
    }
    private String getInfo(String flag){
        System.out.println("++++"+flag);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return df.format(new Date());
    }
}
