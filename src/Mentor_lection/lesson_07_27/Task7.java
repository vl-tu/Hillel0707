package Mentor_lection.lesson_07_27;

public class Task7 {
    //5. Вывести квадрат из букв смещая первый символ в конец строки, слово help:
    //help
    //elph
    //lphe
    //phel

    public static void main(String[] args) {
        String s = "help";
        test(s);
    }

    static void test(String s) {
        for (int i = 0; i < s.length(); i++) ;
        System.out.println(s);
        s = s.substring(1) + s.charAt(0);
    }
}

