package Homeworks.homeworks_4;

import java.util.Scanner;

public class Task_4_1 {
    public static void main(String[] args) {
        System.out.println("Введи число 1,2 или 3");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                System.out.println("Вы ввели число 1");
                break;
            }
            case 2: {
                System.out.println("Вы ввели число 2");
                break;
            }
            case 3: {
                System.out.println("Вы ввели число 3");
                break;
            }
            default: {
                System.out.println("Вы ввели число не равное 1,2 или 3");
            }
        }


    }
}