package com.example.baithigiuaki.baitapvexehoi;

public class Vehicle {
    private  String trademark;
    private  String color;

    public Vehicle(String trademark, String color) {
        this.trademark = trademark;
        this.color = color;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void startUp(){}
    public void acceleration(){}

    public void stop(){}


    @Override
    public String toString() {
        return "Vehicle{" +
                "trademark='" + trademark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
