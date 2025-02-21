package org.example;

public class Animal {

    int age = 10;
    public static  void main(String[] args) {
        System.out.println("Hello World");
        Animal animal = new Animal();
        animal.age = 20;

        System.out.println(animal.age);

        Cat cb = new Cat();
        cb.meow();

        Cow nm = new Cow();
        nm.show();
        nm.clap();
    }
}
