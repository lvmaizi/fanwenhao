package com.example.fanwenhao.designModel.command;

public class OnTvCommand implements Command{
    private TV tv;
    public OnTvCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
