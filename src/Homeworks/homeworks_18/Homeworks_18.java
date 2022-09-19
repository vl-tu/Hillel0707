package Homeworks.homeworks_18;

/**
 * Строки 15-18 необходим только для красивого визуального вывода массива в консоль
 */

public class Homeworks_18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Array after change: { ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
            if (i == 9) {
                System.out.print(array[i] + " ");
                break;
            }
            System.out.print(array[i] + "," + " ");
        }
        System.out.println("}");
    }
}
