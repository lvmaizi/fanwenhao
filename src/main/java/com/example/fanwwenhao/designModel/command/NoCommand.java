package com.example.fanwwenhao.designModel.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("空命令什么都不做");
    }
}
