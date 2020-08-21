package com.example.fanwwenhao.designModel.handleChain;

public class Test {
    public static void main(String[] args) {
        Request request = new Request();
        request.setDescribe("three1");
        FirstHandler handler = new FirstHandler(new TwoHandler(new ThreeHandler(new NullHandler())));
        handler.handle(request);
    }
}
