package Lessons.lessons_08_01;

public class Lessons_08_01 {
    public static void main(String[] args) {
        int month = 4;
        String monthString = null;
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            default:
                monthString = "Я не знаю такого месяца";
        }
        System.out.println(monthString);

        System.out.println("------------------------------------------------------------------------");

        double a = Math.random();
        System.out.println(a);

        //(Math.random() * (b-a))+ a
        // [0,3)
        // (Math.random() * (3-0))+ 0 = Math.random() * 3
        double b = Math.random() * 3;
        System.out.println(b);

        // [2,3)
        // (Math.random() * (3-2))+ 2 = Math.random() * 2
        double v = Math.random() + 2;
        System.out.println(v);


        // [0,2]
        int m = (int) (Math.random() * 3);
        System.out.println(m);

        System.out.println("------------------------------------------------------------------------");

        String text = "Привет меня зовут Влад";
        String[] words = text.trim().split(" ");
        System.out.println(words[1]);

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(words.length);
    }
}
