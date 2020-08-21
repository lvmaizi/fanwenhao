package com.example.fanwwenhao.designModel.command;

public class OnWindowsCommand implements Command{
    Windows windows;
    public OnWindowsCommand(Windows windows){
        this.windows = windows;
    }

    @Override
    public void execute() {
        windows.onWindows();
    }
}
