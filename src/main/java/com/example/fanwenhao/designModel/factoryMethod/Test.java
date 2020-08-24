package com.example.fanwenhao.designModel.factoryMethod;

public class Test {
    public static void main(String[] args) {
        Water water = new NongfuFactory().createWater();
        water.describe();
    }
}
