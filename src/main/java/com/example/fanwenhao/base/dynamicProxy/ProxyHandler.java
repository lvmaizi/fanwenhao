package com.example.fanwenhao.base.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Date 2020/6/10 17:27
 * @Version 1.0
 */
public class ProxyHandler implements InvocationHandler {
    public Object object;
    public ProxyHandler(Object o){
        this.object = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ...");
        method.invoke(object,args);
        System.out.println("after ...");
        return null;
    };
}
