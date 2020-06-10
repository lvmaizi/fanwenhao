package com.example.fanwwenhao.designModel;

/**
 * @Date 2020/5/22 14:23
 * @Version 1.0
 */
public class Single {
    //例子1 饿汉式
    class Single1{
        private Single1(){}
        private Single1 single1 = new Single1();
        public Single1 getInstance(){
            return single1;
        }
    }

    //例子2 懒汉式
    class Single2{
        private Single2(){};
        private volatile Single2 single2;
        public Single2 getInstance(){
            synchronized(Single2.class){
                if(single2 == null){
                    single2 = new Single2();
                }
            }
            return single2;
        }
        //双重检查优化 volatile 为了解决指令重排序 导致的访问对象异常
        public Single2 getInstance2(){
            if(single2 == null) {
                synchronized (Single2.class) {
                    if (single2 == null) {
                        single2 = new Single2();
                    }
                }
            }
            return single2;
        }
    }

    //例子3 内部类
    static class Single3{
        private static final Single3 single3 = new Single3();
    }
    public Single3 get(){return Single3.single3;}

    //例子4
    class Single4{

    }

    //例子5
    class Single5{

    }
}
