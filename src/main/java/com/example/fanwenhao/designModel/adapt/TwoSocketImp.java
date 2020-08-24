package com.example.fanwenhao.designModel.adapt;

public class TwoSocketImp implements TwoSocket {
    public void connect(TwoCharger twoCharger) {
        System.out.println("已经连接二线插座");
        twoCharger.reCharger();
    }
}
