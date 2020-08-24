package com.example.fanwenhao.designModel.command;

public class Test {
    public static void main(String[] args) {
        Controller yaoKongQi = new Controller();
        yaoKongQi.setCommand(0,new OnTvCommand(new TV()));
        yaoKongQi.setCommand(1,new OnWindowsCommand(new Windows()));
        yaoKongQi.button1();
        yaoKongQi.button2();
        yaoKongQi.button3();
    }
}
