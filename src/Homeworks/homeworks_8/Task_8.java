package Homeworks.homeworks_8;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Введите два любых числа. Можно использовать как целые числа, так и дробные (Дробные числа следует вводить через символ ',').");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число 1: ");
        double input_1 = scanner.nextDouble();
        System.out.println("Число 2: ");
        double input_2 = scanner.nextDouble();
        System.out.println(" Из двух введенных Вами чисел, меньшим является число: " + Math.min(input_1, input_2));
    }
}
