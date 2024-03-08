package com.example.baithigiuaki.baitapvexehoi;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("lexu", "black");
        System.out.println(car.toString());
        car.startUp();
        car.acceleration();
        car.stop();

        Vehicle motorcycle = new Motorcycle("drim", " trang");
        System.out.println(motorcycle.toString());
        motorcycle.startUp();
        motorcycle.acceleration();
        motorcycle.stop();

        Vehicle truck = new Truck("huyndai", "blue");
        System.out.println(truck.toString());
        truck.startUp();
        truck.acceleration();
        truck.stop();
    }
}
