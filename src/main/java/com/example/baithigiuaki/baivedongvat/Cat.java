package com.example.baithigiuaki.baivedongvat;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void Say(){
        System.out.println("keu: meo meo");
    }

    @Override
    public void Move(){
        System.out.println("nhay");
    }
}
