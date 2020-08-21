package com.example.fanwwenhao.designModel.handleChain;

public class ThreeHandler implements Handler {
    Handler next ;
    ThreeHandler (Handler handler) {
        this.next = handler;
    }
    @Override
    public void handle(Request request) {
        if(isCan(request)){
            System.out.println("第三处理器可以处理，正在处理");
        }else {
            System.out.println("第三处理器不能处理，正在转交");
            next.handle(request);
        }
    }

    @Override
    public boolean isCan(Request request) {
        if("three".equals(request.getDescribe()))return true;
        return false;
    }
}
