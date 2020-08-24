package com.example.fanwenhao.designModel.abstractFactory;

public class ApplePhone implements Phone {
    @Override
    public void describe() {
        System.out.println("我是苹果手机啊");
    }
}
