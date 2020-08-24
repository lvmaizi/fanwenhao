package com.example.fanwenhao.designModel.observer;

public class Person2 implements Observer {
    @Override
    public void handle() {
        System.out.println("我是民工2,已经收到通知");
    }
}
