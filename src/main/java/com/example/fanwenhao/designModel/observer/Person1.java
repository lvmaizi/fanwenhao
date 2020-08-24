package com.example.fanwenhao.designModel.observer;

public class Person1 implements Observer {
    @Override
    public void handle() {
        System.out.println("我是民工1,已经收到通知");
    }
}
