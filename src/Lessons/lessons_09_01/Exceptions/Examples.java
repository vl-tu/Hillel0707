package Lessons.lessons_09_01.Exceptions;

public class Examples {
    public static void main(String[] args) {
        int a = 5;
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException w) {
            System.out.println(" Не дели на ноль!");
        }

        System.out.println("Поехали дальше");
    }

}
