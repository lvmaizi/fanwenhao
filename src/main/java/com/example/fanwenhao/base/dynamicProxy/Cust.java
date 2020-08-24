package com.example.fanwenhao.base.dynamicProxy;

/**
 * @Date 2020/6/10 17:00
 * @Version 1.0
 */
public class Cust implements P{
    @Override
    public String sayName(){
        System.out.println("say Name");
        return "sayName";
    }
}
