package com.example.fanwenhao.designModel.handleChain;

public interface Handler {
    void handle(Request request);
    boolean isCan(Request request);
}
