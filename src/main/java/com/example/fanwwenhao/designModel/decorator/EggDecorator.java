package com.example.fanwwenhao.designModel.decorator;

public class EggDecorator extends Decorator{
    Bing bing;
    public EggDecorator(Bing bing){
        this.bing = bing;
    }
    @Override
    public double cost() {
        System.out.println("加个蛋,加一元");
        return this.bing.cost()+1.0;
    }
}
