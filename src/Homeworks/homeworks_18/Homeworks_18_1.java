package Homeworks.homeworks_18;

import java.util.Scanner;

public class Homeworks_18_1 {
    public static void main(String[] args) {
        int[] userArray = inputArray();
        int[] changedArray = changeArray(userArray);
        outputArray(changedArray);
    }

    private static void outputArray(int[] changedArray) {
        System.out.println("Your array after change: ");
        for (int i = 0; i < changedArray.length; i++) {
            System.out.print(changedArray[i] + " ");
        }
    }

    private static int[] changeArray(int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] % 2 != 0) {
                userArray[i] += 1;
            }
        }
        return userArray;
    }

    private static int[] inputArray() {
        Scanner scannerArray = new Scanner(System.in);
        System.out.println("Input array lenght: ");
        int userArraySize = scannerArray.nextInt();
        int userArray[] = new int[userArraySize];
        for (int i = 0; i < userArraySize; i++) {
            System.out.println("Input " + (i + 1) + " element of array: ");
            userArray[i] = scannerArray.nextInt();
        }
        System.out.println("Your array: ");
        for (int i = 0; i < userArraySize; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.println();
        return userArray;
    }
}
