package com.example.fanwenhao.base.classLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date 2020/5/12 9:58
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println(Test.class.getClassLoader());
        Class c = Test.class.getClassLoader().loadClass("com.example.fanwenhao.base.classLoader.Instance");
        Instance instance = (Instance) c.newInstance();
        instance.print();
        MyClassloader classLoader = new MyClassloader();
        Class c1 = classLoader.loadClass("com.example.fanwenhao.base.classLoader.Instance1");
        Object o = c1.newInstance();
        Method method = c1.getMethod("print");
        System.out.println(method.invoke(o));
        System.out.println(c1.getClassLoader());
        Sun sun = new Sun();
    }
}
