package com.example.fanwenhao.designModel.observer;

public interface Subject {
    //增加观察者
    public void addObserver(Observer observer);
    //移除观察者
    public void removeObserver(Observer observer);
    //通知观察者
    public void notifyHandle();
}
