package com.example.fanwwenhao.designModel.adapt;

public class ThreeCharger implements Charger {
    @Override
    public void reCharger() {
        System.out.println("三线插头正在充电。。。");
    }
}
