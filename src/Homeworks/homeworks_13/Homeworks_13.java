package Homeworks.homeworks_13;

public class Homeworks_13 {

    public static void main(String[] args) {
        int[] arrRandom = arrayrandom();
        int sumArray = sumOfArrayRandom(arrRandom);
        double arrayAverage = arrayAverage(sumArray);
        outputResult(arrayAverage);
    }

    public static int[] arrayrandom() {
        // [10,20]
        // a=10
        // b=20
        int array[] = new int[10];
        System.out.print("Массив из рандомных чисел [ ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11 + 10); // Math.random() * (b-a +1) + a) -> (Math.random() * (20-10 +1) + 1
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        return array;
    }

    public static int sumOfArrayRandom(int[] arrRandom) {
        int sum = 0;
        for (int temp : arrRandom) {
            sum += temp;
        }
        return sum;
    }

    public static double arrayAverage(double sumArray) {
        double arrayAverage = sumArray / 10;
        return arrayAverage;
    }

    public static void outputResult(double result) {
        System.out.println("Среднее арифметическое массива = " + result);
    }
}
