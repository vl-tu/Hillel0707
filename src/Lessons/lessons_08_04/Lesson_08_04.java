package Lessons.lessons_08_04;

public class Lesson_08_04 { // шаблон для методов и свойств
    int time = 3600; // свойство или поле

    public static void main(String[] args) {
        int n = 9;
        int k = 4;
        int m = n % k;
        System.out.println(m);

        // 9-4 = 5
        // 5-4= 1

        int iYear, twoDigit;
        iYear = 2013;
        twoDigit = iYear % 100;
        System.out.println(twoDigit);

    }

    public void sayHello() { // метод
        System.out.println("Hello world");

        // Принципы ООП
        // - наследование
        // - полиморфизм
        // - инкапсуляция
    }
}
