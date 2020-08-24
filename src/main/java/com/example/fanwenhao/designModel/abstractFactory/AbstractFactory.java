package com.example.fanwenhao.designModel.abstractFactory;

public abstract class AbstractFactory {
    //生产耳机
    public abstract Headset createHeadset() ;
    //生产手机
    public abstract Phone createPhone();
}
