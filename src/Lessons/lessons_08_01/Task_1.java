package Lessons.lessons_08_01;


public class Task_1 {
    //Написать программу, в которой создаётся целочисленный
    //массив из 8 случайных чисел из диапозона  [0, 99]
    //и выводит максимальный элемент массива в консоль.

    public static void arrMax() {
        int max = 0;
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }

    public static void main(String[] args) {
        arrMax();
    }
}
