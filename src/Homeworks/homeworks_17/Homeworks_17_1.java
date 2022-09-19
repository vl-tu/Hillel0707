package Homeworks.homeworks_17;

import java.util.Scanner;

/**
 * Доработка задачи. Пользователю предлагается выбрать длину диапазона чисел и минимальное число диапазона.
 * После выбора минимального значения и длины, выстраивается массив последовательных чисел.
 * Пользователь может задать число из массива которое должно быть счастливым.
 */

public class Homeworks_17_1 {
    public static void main(String[] args) {
        int[] rangeOfNumbers = userRangeOfNumbers();
        int luckyNumber = luckyNumberChoose();
        luckyNumberSearch(rangeOfNumbers, luckyNumber);
    }

    private static int[] userRangeOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Твой промежуток чисел будет состоять из последовательных чисел. Введи длину промежутка: ");
        int sizeRange = scanner.nextInt();
        System.out.println("Введи число с которого будет начинаться промежуток: ");
        int minNumber = scanner.nextInt();


        int[] rangeOfNumbers = new int[sizeRange];
        for (int i = 0; i < rangeOfNumbers.length; i++) {
            rangeOfNumbers[i] = minNumber++;
        }
        System.out.println("Твой заданный промежуток чисел: ");
        for (int i = 0; i < sizeRange; i++) {
            System.out.print(rangeOfNumbers[i] + " ");
        }
        System.out.println();
        return rangeOfNumbers;
    }


    private static int luckyNumberChoose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи какое число из данного промежутка должно быть счастливым: ");
        return scanner.nextInt();

    }

    private static void luckyNumberSearch(int[] rangeOfNumbers, int luckyNumber) {
        System.out.println("Ищу твоё счастливое число в заданном промежутке: ");
        for (int search : rangeOfNumbers) {
            if (search == luckyNumber) {
                System.out.println(search + " " + "- Это твоё счастливое число");
                break;
            }
            System.out.println(search + " " + "- Не счастливое число ");
        }

    }
}
