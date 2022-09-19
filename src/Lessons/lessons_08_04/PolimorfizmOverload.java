package Lessons.lessons_08_04;

public class PolimorfizmOverload {
    public static void main(String[] args) {
        int a = 100;
        double b = 2.2;
        String с = "Hello";
        add();
        add(5, 5);
        add(5.5, 6.2);
        add("Vlad", 9);
    }

    public static void add() {
        System.out.println("Hello");
    }

    public static void add(int a, int b) {
        int с = a + b;
        System.out.println(с);
    }

    public static void add(double a, double b) {
        double e = a + b;
        System.out.println(e);
    }

    public static void add(String a, int b) {
        System.out.println(a + " " + b);
    }
}
