package com.example.fanwenhao.designModel.builder;

public class Test {
    public static void main(String[] args) {
        DecisionRequest decisionRequest = DecisionRequest
                .createBuilder()
                .setBizNo("123")
                .setModuleNo("APV")
                .setBizType("ASA")
                .build();
        System.out.println(decisionRequest);
    }
}
