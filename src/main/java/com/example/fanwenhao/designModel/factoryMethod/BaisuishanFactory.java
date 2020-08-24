package com.example.fanwenhao.designModel.factoryMethod;

public class BaisuishanFactory implements WaterFactory {
    @Override
    public Water createWater() {
        return new BaiSuiShan();
    }
}
