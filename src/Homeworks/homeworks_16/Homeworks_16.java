package Homeworks.homeworks_16;

import java.util.Scanner;

public class Homeworks_16 {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int number_1 = getInt();

        System.out.println("Select an available Math operation (+, -, *, /):");
        char operation = getOperation();

        /**
         В данном коде была проведена доработка. Оператором Switch была добавлена проверка на предмет того, вводит ли пользователь доступную математическую операцию.
         - В случае если пользователь хочет использовать доступную математическую операцию, ему предложит ввести второе число и выдаст результат исчисления.
         - В случае если пользователь выбирает не доступную математическую операцию. Пользователю отобразится сообщение с тестом ошибки в консоли.
         */

        switch (operation) {
            case '+', '-', '*', '/' -> {
                System.out.println("Enter the second number 2: ");
                int number_2 = getInt();

                int result = calc(number_1, number_2, operation);

                System.out.println("Result of Math Operation:");
                System.out.println(number_1 + " " + operation + " " + number_2 + " " + "=" + " " + result);
            }
            default -> System.out.println("Error! You choose uncorrect Math Operation!");
        }
    }

    private static int calc(int num1, int num2, char operation) {
        int result = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
        return result;
    }

    private static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        String inputMathOperation = scanner.nextLine();
        String inputMathOperation_new = inputMathOperation.replaceAll(" ", "");
        char mathOperation = inputMathOperation_new.charAt(0);

        return mathOperation;
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        return number;
    }
}