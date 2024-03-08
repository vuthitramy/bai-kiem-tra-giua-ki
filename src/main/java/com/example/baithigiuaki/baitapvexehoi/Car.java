package com.example.baithigiuaki.baitapvexehoi;

public class Car extends Vehicle {
    public Car(String trademark, String color) {
        super(trademark, color);
    }

    @Override
    public void startUp() {
        System.out.println(" van chia khoa va no may");
    }

    @Override
    public void acceleration() {
        System.out.println(" dam chan ga");
    }

    @Override
    public void stop() {
        System.out.println(" dam chan phanh");

    }
}
