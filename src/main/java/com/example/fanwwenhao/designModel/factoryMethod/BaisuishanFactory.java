package com.example.fanwwenhao.designModel.factoryMethod;

public class BaisuishanFactory implements WaterFactory {
    @Override
    public Water createWater() {
        return new BaiSuiShan();
    }
}
