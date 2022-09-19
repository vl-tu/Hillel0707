package Lessons.lessons_08_04;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создание обьекта Cat или создание экземлаяр класа
        cat.sayHello();
        catActions();
    }

    public static void catActions() {
        Cat cat = new Cat();
        cat.jump();
        cat.run();
    }
}
