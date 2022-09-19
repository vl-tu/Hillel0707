package Lessons.Lessons_08_25;

public class lessons_08_25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " I am doing befor continue");
            if (i > 2) {
                continue;
            }
            System.out.println("          " + i + " я wiil doing 2 x ;(");
        }
    }
}
