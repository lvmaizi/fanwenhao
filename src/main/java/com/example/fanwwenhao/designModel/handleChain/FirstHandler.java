package com.example.fanwwenhao.designModel.handleChain;

public class FirstHandler implements Handler {
    private Handler next ;
    public FirstHandler(Handler next){
        this.next = next;
    }
    @Override
    public void handle(Request request) {
        if(isCan(request)){
            System.out.println("第一处理器可以处理，正在处理。。。");
        }else {
            System.out.println("第一处理器不能处理，转交下一处理");
            next.handle(request);
        }
    }

    @Override
    public boolean isCan(Request request) {
        if("first".equals(request.getDescribe()))return true;
        return false;
    }
}
