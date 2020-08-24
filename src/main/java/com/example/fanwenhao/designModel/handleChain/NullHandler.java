package com.example.fanwenhao.designModel.handleChain;

public class NullHandler implements Handler {
    @Override
    public void handle(Request request) {
        System.out.println("没有能处理的处理器。。。记录日志");
    }

    @Override
    public boolean isCan(Request request) {
        return true;
    }
}
