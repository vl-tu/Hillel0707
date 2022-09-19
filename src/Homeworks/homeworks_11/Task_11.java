package Homeworks.homeworks_11;

public class Task_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Это " + i + "-й урок!");
            switch (i) {
                case 1:
                    System.out.println("Я выполнил все домашние задания " + i + "-го урока");
                    break;
                case 2:
                    System.out.println("Я выполнил все домашние задания " + i + "-го урока");
                    break;
                default:
                    System.out.println("Я не выполнил домашние задания " + i + "-го урока");


            }
        }
    }
}
