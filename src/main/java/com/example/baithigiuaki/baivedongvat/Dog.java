package com.example.baithigiuaki.baivedongvat;

import jdk.jfr.snippets.Snippets;

public class Dog extends Animal{
    public  Dog (String name, int age){
        super(name, age);
    }
    @Override
    public  void Say(){
        System.out.println("sua: gau gau");
    }

    @Override
    public  void Move(){
        System.out.println("chay ....");
    }
}
