package Lessons.Lessons_08_25.adbstractExample;

abstract class Car {
    abstract String maxSpeeed();

    abstract void drive();

    abstract void brake();

    void countWheels() {
        System.out.println("4");
    }
}
