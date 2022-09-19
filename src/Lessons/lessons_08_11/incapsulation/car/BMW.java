package Lessons.lessons_08_11.incapsulation.car;

import Lessons.lessons_08_11.incapsulation.specification.Specific;

public class BMW {
    public static void main(String[] args) {
        Specific specific = new Specific();
        System.out.println(specific.fuel);

        specific.fuel = "diesel";
        System.out.println(specific.fuel);
    }
}
