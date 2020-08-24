package com.example.fanwenhao.designModel.adapt;

public class Test {
    public static void main(String[] args) {
        TwoCharger iphoneCharger = new TwoCharger();
        ThreeSocket threeSocket = new ThreeSocketImp();
        TwoSocket threeToTwoAdapt = new ThreeToTwoAdapt(threeSocket);
        threeToTwoAdapt.connect(iphoneCharger);
    }
}
