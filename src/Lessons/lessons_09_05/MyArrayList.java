package Lessons.lessons_09_05;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Alex");
        name.add("Maks");
        name.add("Olga");


        // add - добавлять
        // get - доставать
        // set - заменять
        // remove - удалять


        name.add(1, "Nona");
        System.out.println(name.get(1));
        System.out.println("_____________________________________");
        System.out.println(name.indexOf("Alex")); // под номером 0 в листе
        System.out.println(name.indexOf("Ira")); // -1 так как нет такого елеменат листа
        System.out.println("_____________________________________");

        name.set(2, "Petr");
        System.out.println(name.get(2));

        System.out.println("_________ ____________________________");
        name.remove("Alex");
        System.out.println(name.get(0));
        name.remove(0);
        System.out.println(name.get(0));
        name.remove(name.remove(0));
        System.out.println(name.get(0));
    }
}
