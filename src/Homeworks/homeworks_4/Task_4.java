package Homeworks.homeworks_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введи число 1,2 или 3");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Вы ввели число 1");
        } else if (input == 2) {
            System.out.println("Вы ввели число 2");
        } else if (input == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1,2 или 3");
        }
    }
}