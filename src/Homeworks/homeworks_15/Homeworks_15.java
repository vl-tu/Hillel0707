package Homeworks.homeworks_15;

public class Homeworks_15 {

    public static void main(String[] args) {
        int[] inputArray = {11, 3, 1, 14, 7};

        int[] sortedArray = sortFromMaxToMin(inputArray);
        for (int outputArray : sortedArray) {
            System.out.print(outputArray + " ");
        }
    }


    public static int[] sortFromMaxToMin(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] > array[i]) {
                    isSorted = false;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}