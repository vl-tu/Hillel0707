package Homeworks.homeworks_20.cat_dog.dog;

import Homeworks.homeworks_20.cat_dog.animal.Animal;

public class Dog extends Animal {


    private final String Dogname;

    public Dog(String name) {
        super();
        this.Dogname = name;
    }


    @Override
    public void sound() {

        System.out.println("I am a Dog. My name is " + Dogname + ". Gav ");
    }
}
