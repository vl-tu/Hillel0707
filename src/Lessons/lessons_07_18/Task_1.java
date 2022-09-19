package Lessons.lessons_07_18;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введи первое число:");
        Scanner scanner_1 = new Scanner(System.in);
        int number_1 = scanner_1.nextInt();

        System.out.println("Введи второе число:");
        Scanner scanner_2 = new Scanner(System.in);
        int number_2 = scanner_2.nextInt();

        System.out.println("Введи имя:");
        Scanner scanner_3 = new Scanner(System.in);
        String text = scanner_3.nextLine();

        String result = text + " " + (number_1 + number_2);
        System.out.println(result);
    }
}
