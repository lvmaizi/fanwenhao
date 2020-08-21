package com.example.fanwwenhao.designModel.command;

public class Controller {
    Command[] commands;
    public Controller(){
        commands = new Command[3];
        for (int i = 0; i < commands.length; i++){
            commands[i] = new NoCommand();
        }
    }
    //按钮1
    public void button1(){
        commands[0].execute();
    }
    //按钮2
    public void button2(){
        commands[1].execute();
    }
    //按钮3
    public void button3(){
        commands[2].execute();
    }
    //设置卡槽
    public void setCommand(int slot,Command command){
        if(slot < 0 || slot >= commands.length)return;
        this.commands[slot] = command;
    }
}
