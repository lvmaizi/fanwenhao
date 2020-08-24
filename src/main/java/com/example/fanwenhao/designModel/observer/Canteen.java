package com.example.fanwenhao.designModel.observer;

import java.util.ArrayList;
import java.util.List;

public class Canteen implements Subject {
    List<Observer> observers = null;
    public Canteen(){
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        for (int i = 0; i < observers.size(); i++){
            if(observers.get(i) == observer){
                observers.remove(i);
                return;
            }
        }
    }

    @Override
    public void notifyHandle() {
        for (Observer o : observers){
            o.handle();
        }
    }
}
