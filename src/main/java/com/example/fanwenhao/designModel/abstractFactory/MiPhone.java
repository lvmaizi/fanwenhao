package com.example.fanwenhao.designModel.abstractFactory;

public class MiPhone implements Phone {
    @Override
    public void describe() {
        System.out.println("我是小米手机啊");
    }
}
