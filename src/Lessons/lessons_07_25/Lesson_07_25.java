package Lessons.lessons_07_25;

import java.util.Arrays;

public class Lesson_07_25 {
    public static void main(String[] args) {

        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;
        System.out.println(twoDimArray[0][1]);
        System.out.println("--------------------------------------------------------------------------------------------");

        int[][] twoDimArray_2 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};

        for (int i = 0; i < twoDimArray_2.length; i++) {
            for (int j = 0; j < twoDimArray_2[i].length; j++) {
                System.out.print(" " + twoDimArray_2[i][j] + " ");
                //  twoDimArray_2[0][0]
                //  twoDimArray_2[0][1]
                //  twoDimArray_2[0][2]
                //  twoDimArray_2[0][3]
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        for (int[] ints : twoDimArray_2) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(" " + ints[j] + " ");
                //  twoDimArray_2[0][0]
                //  twoDimArray_2[0][1]
                //  twoDimArray_2[0][2]
                //  twoDimArray_2[0][3]
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        int[][] twoDimArray_3 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(twoDimArray_3));

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("--------------------------------------------------------------------------------------------");
        sayHello();
        mySum(5, 2);
        mySum2(6, 4);

        int mathOperation = mySum(4, 5);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        sayNameAndAge("Vlad", 23);
    }

    static void sayHello() {
        System.out.println("Hello World");
    }

    static int mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static void mySum2(int a, int b) {
        int sum = a + b;
        return;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }


}