package com.example.fanwenhao.designModel.abstractFactory;

public class AppleHeadset implements Headset {
    @Override
    public void describe() {
        System.out.println("我是苹果耳机");
    }
}
