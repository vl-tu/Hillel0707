package Homeworks.homeworks_17;

public class Homeworks_17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                System.out.println(array[i] + " " + "- Это твоё счастливое число");
                break;
            }
            System.out.println(array[i] + " " + "- Не счастливое число ");
        }
    }
}