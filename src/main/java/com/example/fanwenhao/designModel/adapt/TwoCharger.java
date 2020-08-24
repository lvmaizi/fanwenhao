package com.example.fanwenhao.designModel.adapt;

public class TwoCharger implements Charger {
    @Override
    public void reCharger() {
        System.out.println("二线插头正在充电");
    }
}
