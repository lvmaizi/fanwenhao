package com.example.fanwenhao.designModel.adapt;

public class ThreeToTwoAdapt implements TwoSocket {
    private ThreeSocket threeSocket;
    public ThreeToTwoAdapt(ThreeSocket threeSocket){
        this.threeSocket = threeSocket;
    }
    @Override
    public void connect(TwoCharger twoCharger) {
        System.out.println("正在适配连接");
        threeSocket.connect(new ThreeCharger());
        twoCharger.reCharger();
    }
}
