package com.example.fanwwenhao.designModel.decorator;


public class EggBing implements Bing {
    @Override
    public double cost() {
        System.out.println("什么都不加是五元");
        return 5;
    }
}
