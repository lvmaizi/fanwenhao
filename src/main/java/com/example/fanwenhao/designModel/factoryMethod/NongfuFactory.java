package com.example.fanwenhao.designModel.factoryMethod;

public class NongfuFactory implements WaterFactory {
    @Override
    public Water createWater() {
        return new NongFu();
    }
}
