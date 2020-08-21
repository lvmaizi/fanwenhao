package com.example.fanwwenhao.designModel.decorator;

public class Test
{
    public static void main(String[] args) {
        Bing bing = new EggBing();
        bing = new EggDecorator(bing);
        bing = new JiliuDecorator(bing);
        bing = new JiliuDecorator(bing);
        System.out.println("总消费"+bing.cost());
    }
}
