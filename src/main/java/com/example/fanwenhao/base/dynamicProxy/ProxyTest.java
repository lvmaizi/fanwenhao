package com.example.fanwenhao.base.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Date 2020/6/10 17:13
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Cust cust = new Cust();
        ProxyHandler proxyHandler = new ProxyHandler(cust);
        P p = (P) Proxy.newProxyInstance(cust.getClass().getClassLoader(),cust.getClass().getInterfaces(),proxyHandler);
        p.sayName();
    }
}
