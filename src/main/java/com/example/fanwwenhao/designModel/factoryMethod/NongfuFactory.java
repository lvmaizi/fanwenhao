package com.example.fanwwenhao.designModel.factoryMethod;

public class NongfuFactory implements WaterFactory {
    @Override
    public Water createWater() {
        return new NongFu();
    }
}
