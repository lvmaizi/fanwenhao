package com.example.fanwenhao.java8.optional;

import java.util.Optional;

/**
 * @Date 2020/3/27 16:57
 * @Version 1.0
 */
class Person {
    public Optional<Car> car;
    public Optional<Car> getCar() {return car;}
}
class Car {
    public Optional<Insurance> insurance;
    public Optional<Insurance> getInsurance() {return insurance;}
}
class Insurance{
    public String name;
    public String getName() {return name;}
}
public class OptionalTest {
    public static void main(String[] args) {
        Optional<Car> optionalCar = Optional.empty();
        Optional<Car> optionalCar1 = Optional.ofNullable(null);
        Insurance insurance = new Insurance();
        insurance.name = "fwh";
        Optional<Insurance> optionalInsurance = Optional.of(insurance);
        System.out.println(optionalInsurance.map(Insurance::getName));
        System.out.println("ss");
    }
}
