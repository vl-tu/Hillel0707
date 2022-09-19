package Lessons.lessons_08_18;

public class lesson_08_18 {
    public static void main(String[] args) {
        int mouse;
        int weight;
        mouse = 5;
        weight = 45;
        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормить кота");
        } else {
            System.out.println("Error");
        }

        if (mouse == 7 | weight < 100) {
            System.out.println("Можно кормить кота");
        } else {
            System.out.println("Error");
        }

        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
    }
}
