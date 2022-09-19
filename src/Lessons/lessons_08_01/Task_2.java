package Lessons.lessons_08_01;


import java.util.Scanner;

public class Task_2 {
    //Написать программу, в которой пользователю предлогается ввести в консоль текст "Привет меня зовут Максим".
    // Далее создать массив и записать каждое слово в отдельный элемент массива.
    // Вывести в консоль строку из элементов массива в обратном порядке используя формулу  n-i-1.
    //Каждое действие должно выполняться в отдельном методе! Т.е. В методе main только вызов пользовательских методов!
    public static void main(String[] args) {
        consoleOutput("Введите како-то текст");
        String str = getInputString();
        String[] wordsArr = arrayfromStr(str);
        String[] rewertArr = revertArray(wordsArr);
        printArray(rewertArr);

    }

    public static void consoleOutput(String str) {
        System.out.println(str);
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        String rawStr = scanner.nextLine();
        return rawStr;

    }

    public static String[] arrayfromStr(String str) {
        String[] words = str.trim().split(" ");
        return words;
    }

    public static String[] revertArray(String[] words) {
        String[] arr = words;
        String temp = null;
        int count = arr.length;
        for (int i = 0; i < count / 2; i++) {
            temp = arr[count - i - 1];
            arr[count - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void printArray(String[] words) {
        for (String word : words) {
            System.out.println(word + " ");
        }
    }

}
