package com.example.redpacket;

import java.util.Random;

public class Person implements Receive,Sender {
    public int[] redPackage;
    @Override
    public void vie() {

    }

    @Override
    public void send(double money, int count) {
        redPackage = new int[count];
        Random random = new Random();
        for (int i = 0;i < (int)money*100; i++){
            redPackage[random.nextInt(count)] += 1;
        }

    }

    public static void main(String[] args) {
        new Person().send(30.00,10);
    }
}
