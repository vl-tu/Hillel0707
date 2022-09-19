package Lessons.lessons_09_01.Exceptions;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int[] a = {3, 4, 5};
        try {
            System.out.println(a[f] / 0);
        } catch (IndexOutOfBoundsException i) {
            System.out.println(" Недопустимый элемент масива");
        } catch (ArithmeticException u) {
            System.out.println(" На ноль делить нельзя");
        }
        System.out.println(" Погнали дальше");

    }
}
