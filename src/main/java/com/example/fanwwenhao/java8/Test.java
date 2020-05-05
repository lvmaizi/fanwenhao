package com.example.fanwwenhao.java8;

import com.example.fanwwenhao.esper.Coder;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Date 2020/3/26 9:32
 * @Version 1.0
 */
public class Test {
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Optional<Coder> optional = Optional.ofNullable(null);
        ReentrantLock reentrantLock;
        HashMap hashMap  =  new HashMap();
        ConcurrentHashMap concurrentHashMap;
        ArrayList arrayList;
        LinkedList linkedList;
        hashMap.put("1","1");
        hashMap.put("2","2");
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for (ThreadInfo threadInfo:threadInfos){
            System.out.println(threadInfo.getThreadName());
        }
//        new Thread(()->tt(),"线程A").start();
//        new Thread(()->tt(),"线程B").start();
//        new Thread(()->tt(),"线程C").start();
//        new Thread(()->tt(),"线程D").start();

        //Set set = hashMap.entrySet();
        //System.out.println(optional.get());
        //TimeUnit.SECONDS.sleep(200);

    }
    public static void tt(){
        for (int i=0;i<2;i++){
            try {
              //lock.lock();
                System.out.println(Thread.currentThread().getName()+"获取了锁");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //unlock();
            }
        }
    }
    static class A{}
    static class B implements Comparable<Object>{
        @Override
        public int compareTo(Object o) {return 0;}
    }
    static class C implements Comparable<C>{
        @Override
        public int compareTo(C o) {return 0;}

    }
    static class D implements Comparable<E>{
        @Override
        public int compareTo(E o) {return 0;}
    }
    static class E{}
    static class F extends C{}

    /**
     * Returns x's Class if it is of the form "class C implements
     * Comparable<C>", else null.
     */
    static Class<?> comparableClassFor(Object x) {
        if (x instanceof Comparable) {
            Class<?> c; Type[] ts, as; Type t; ParameterizedType p;
            if ((c = x.getClass()) == String.class) // bypass checks
                return c;
            if ((ts = c.getGenericInterfaces()) != null) {
                for (int i = 0; i < ts.length; ++i) {
                    if (((t = ts[i]) instanceof ParameterizedType) &&
                            ((p = (ParameterizedType)t).getRawType() ==
                                    Comparable.class) &&
                            (as = p.getActualTypeArguments()) != null &&
                            as.length == 1 && as[0] == c) // type arg is c
                        return c;
                }
            }
        }
        return null;
    }

}
