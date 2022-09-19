package Lessons.lessons_08_18;

public class Task_1 {
    public static void main(String[] args) {

    }

    public void check(String str) {
        var lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?') {
            System.out.println("question in the end");
        } else {
            System.out.println("With out question");
        }
    }
}
