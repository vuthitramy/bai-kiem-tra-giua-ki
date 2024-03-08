package com.example.baithigiuaki.baitapvexehoi;

public class Truck extends  Vehicle{
    public Truck(String trademark, String color) {
        super(trademark, color);
    }

    @Override
    public void startUp(){
        System.out.println("van chia khoa vaf no may");
    }

    @Override
    public void acceleration(){
        System.out.println("dap chan ga");
    }

    @Override
    public void stop(){
        System.out.println("dap chan phanh");
    }
}
