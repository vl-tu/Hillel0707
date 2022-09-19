package Homeworks.homeworks_20.cat_dog.cat;

import Homeworks.homeworks_20.cat_dog.animal.Animal;

public class Cat extends Animal {
    private final String CatName;


    public Cat(String name) {
        super();
        this.CatName = name;
    }

    @Override
    public void sound() {
        System.out.println("I am a Cat. My name is " + CatName + ". Meow ");
    }
}
