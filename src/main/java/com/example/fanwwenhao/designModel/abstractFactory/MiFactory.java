package com.example.fanwwenhao.designModel.abstractFactory;

public class MiFactory extends AbstractFactory {
    @Override
    public Headset createHeadset() {
        return new MiHeadset();
    }

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
