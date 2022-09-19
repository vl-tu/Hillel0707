package Mentor_lection.lesson_07_27;

public class Task4 {
    public static void main(String[] args) {
         /*  Вывести на экран  вот такие строки(используя циклы):
           А
           АА
           ААА
           АААА
           ААААА
         */

        String symbol = "A";
        for (int i = 1; i <= 5; i++) {
            System.out.println(symbol);
            symbol += "A";
        }

    }
}

