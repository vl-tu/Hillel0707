package Lessons.lessons_09_01.Exceptions;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int[] a = {3, 4, 5};
        try {
            System.out.println(a[f] / 0);
        } catch (Exception i) {
            System.out.println(" Что-то пошло не так");
        }
        System.out.println(" Погнали дальше");

    }
}
