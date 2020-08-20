package com.example.fanwwenhao.designModel.factoryMethod;

public class Test {
    public static void main(String[] args) {
        Water water = new NongfuFactory().createWater();
        water.describe();
    }
}
