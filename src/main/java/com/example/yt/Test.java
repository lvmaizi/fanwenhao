package com.example.yt;

public class Test {
    public static void main(String[] args) {
        Object1 object1 = new Object1();
        object1.addObserver(new ObserverOne());
        object1.addObserver(new ObserverTwo());
        object1.handel();
    }
}
