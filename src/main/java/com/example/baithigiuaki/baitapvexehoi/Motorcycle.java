package com.example.baithigiuaki.baitapvexehoi;

public class Motorcycle extends  Vehicle{
    public Motorcycle(String trademark, String color) {
        super(trademark, color);
    }

    @Override
    public void startUp(){
        System.out.println("van chia khoa vaf van tay ga");
    }

    @Override
    public void acceleration() {
        System.out.println("dap so va van tay ga");
    }

    @Override
    public void stop() {
        System.out.println("dap phanh");
    }
}
