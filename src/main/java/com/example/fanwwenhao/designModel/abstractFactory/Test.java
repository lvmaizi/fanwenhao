package com.example.fanwwenhao.designModel.abstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AppleFactory();
        Headset headset = abstractFactory.createHeadset();
        Phone phone = abstractFactory.createPhone();
        headset.describe();
        phone.describe();
    }
}
