package com.example.fanwenhao.designModel.handleChain;

public class TwoHandler implements Handler {
    Handler next;
    public TwoHandler(Handler next){
        this.next = next;
    }
    @Override
    public void handle(Request request) {
        if(isCan(request)){
            System.out.println("第二处理器可以处理，正在处理。。。");
        }else {
            System.out.println("第二处理器不能处理，正在转交");
            next.handle(request);
        }
    }

    @Override
    public boolean isCan(Request request) {
        if("two".equals(request.getDescribe()))return true;
        return false;
    }
}
