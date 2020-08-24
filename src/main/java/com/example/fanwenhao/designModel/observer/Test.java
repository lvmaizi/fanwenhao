package com.example.fanwenhao.designModel.observer;

public class Test {
    public static void main(String[] args) {
        Subject canteen = new Canteen();
        canteen.addObserver(new Person1());
        canteen.addObserver(new Person2());
        canteen.notifyHandle();
    }
}
