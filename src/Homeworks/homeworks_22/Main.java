package Homeworks.homeworks_22;


import java.util.Scanner;

public class Main {
    static Individual individual = new Individual();
    static IndividualEntrepreneur individualEntrepreneur = new IndividualEntrepreneur();
    static LegalPersons legalPersons = new LegalPersons();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        int userType = userType();
        int userAction = userAction();
        doAction(userType, userAction);

    }

    private static void doAction(int userType, int userAction) {
        if (userType == 1) {
            switch (userAction) {
                case 1 -> individual.cashWithdrawal();
                case 2 -> individual.accountReplenishment();
                case 3 -> individual.accountBalance();
            }
        } else if (userType == 2) {
            switch (userAction) {
                case 1 -> individualEntrepreneur.cashWithdrawal();
                case 2 -> individualEntrepreneur.accountReplenishment();
                case 3 -> individualEntrepreneur.accountBalance();
            }
        } else {
            switch (userAction) {
                case 1 -> legalPersons.cashWithdrawal();
                case 2 -> legalPersons.accountReplenishment();
                case 3 -> legalPersons.accountBalance();
            }
        }
    }

    private static int userAction() {
        System.out.println("""
                Выбери действие (введи в консоль номер):
                1. Снятие с счета.
                2. Пополнение на счет.
                3. Получение баланса на счет""");
        System.out.print("Выбранное действие: ");
        int userAction = input.nextInt();
        if (userAction < 0 || userAction > 3) {
            System.out.println("ERROR!");
            System.exit(0);
        }
        return userAction;
    }


    private static int userType() {
        System.out.println("""
                 Выбери тип клиента банка (Введи в консоль номер):\s
                1. Физическое лицо\s
                2. Индивидуальный предприниматель\s
                3. Юридическое лицо""");
        System.out.print("Тип клиента: ");

        int userType = input.nextInt();
        if (userType < 0 || userType > 3) {
            System.out.println("ERROR!");
            System.exit(0);
        }
        return userType;
    }
}

