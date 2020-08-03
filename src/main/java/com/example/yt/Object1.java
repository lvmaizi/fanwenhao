package com.example.yt;

import java.util.ArrayList;
import java.util.List;

public class Object1 {
    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void handel(){
        for (Observer observer:observers){
            observer.print();
        }
    }
}
