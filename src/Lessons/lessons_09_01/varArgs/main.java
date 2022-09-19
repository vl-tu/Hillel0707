package Lessons.lessons_09_01.varArgs;

public class main {
    public static void main(String[] args) {
        int count = addAll(2, 4, 6);
        System.out.println(count);

        int count2 = addAll(5, 7, 8, 9, 6, 9, 8);
        System.out.println(count2);
    }

    public static int addAll(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;

    }

    public static int addAll(int... number) {
        int mathSum = 0;
        for (int sum : number) {
            mathSum += sum;
        }
        return mathSum;
    }
}

