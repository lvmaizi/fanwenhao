package com.example.fanwenhao.designModel.decorator;

public class JiliuDecorator extends Decorator {
    private Bing bing;
    public JiliuDecorator(Bing bing){
        this.bing = bing;
    }
    @Override
    public double cost() {
        System.out.println("加个鸡柳加两元");
        return this.bing.cost()+2.0;
    }
}
