package com.example.baithigiuaki.baivedongvat;

public class Bird extends Animal{
    public Bird(String name, int age){
        super(name,age);
    }

    @Override
    public void Say(){
        System.out.println("hot");
    }

    @Override
    public  void Move(){
        System.out.println("bay....");
    }
}
