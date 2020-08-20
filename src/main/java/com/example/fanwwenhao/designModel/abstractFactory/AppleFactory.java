package com.example.fanwwenhao.designModel.abstractFactory;

public class AppleFactory extends AbstractFactory {
    @Override
    public Headset createHeadset() {
        return new AppleHeadset();
    }

    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
