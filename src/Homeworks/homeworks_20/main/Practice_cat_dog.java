package Homeworks.homeworks_20.main;

import Homeworks.homeworks_20.cat_dog.animal.Animal;
import Homeworks.homeworks_20.cat_dog.cat.Cat;
import Homeworks.homeworks_20.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));
        animals.add(new Dog("Buks")); // добавлен дополнительно для теста
        animals.add(new Cat("Billa")); // добавлен дополнительно для теста

        for (Animal animal : animals) {
            animal.sound();
            // expected: I'am a Doc. My name is Tuzik. Gav
            // expected: I'am a Cat. My name Vasya. Mew
        }

    }
}