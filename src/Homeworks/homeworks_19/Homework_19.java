package Homeworks.homeworks_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_19 {
    public static void main(String[] args) {
        int[] defaultArray = {1, 2, 3, 4, 5, 6};
        int newelementOffArray = inputNewelementOffArray();
        ArrayList<Integer> newArray = modificatorOfArray(defaultArray, newelementOffArray);
        outputNewArray(newArray);
    }

    static int inputNewelementOffArray() {
        System.out.println("Input what element you want to add for array: ");
        Scanner newElementScan = new Scanner(System.in);
        return newElementScan.nextInt();
    }

    static ArrayList<Integer> modificatorOfArray(int[] defaultArray, int newelementOffArray) {
        ArrayList<Integer> modifArray = new ArrayList<>();
        for (int i : defaultArray) {
            modifArray.add(i);
        }
        modifArray.add(newelementOffArray);
        return modifArray;
    }

    static void outputNewArray(ArrayList<Integer> newArray) {
        System.out.print("Your new array: " + newArray);
    }
}

