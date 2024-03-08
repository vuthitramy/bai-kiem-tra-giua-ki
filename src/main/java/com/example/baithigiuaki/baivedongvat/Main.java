package com.example.baithigiuaki.baivedongvat;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Cun",1);
        System.out.println(dog.toString());
        dog.Say();
        dog.Move();

        Animal cat = new Cat("Miu" , 2);
        System.out.println(cat.toString());
        cat.Say();
        cat.Move();

        Animal bird = new Bird("bo", 1);
        System.out.println(bird.toString());
        bird.Say();
        bird.Move();
    }
}
