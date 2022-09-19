package Lessons.Lessons_08_25;

public class openBreak {
    public static void main(String[] args) {
        int i = 1;
        int a = 3;
        while (i <= 5) {
            System.out.println(i + "Цикл выполняется");
            if (i == a) {
                break;
            }
            i++;
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
        int number = 2;
        switch (number) {
            case 1 -> System.out.println("Число 1");
            case 2 -> System.out.println("Число 2");
            case 3 -> System.out.println("Число 3");
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
