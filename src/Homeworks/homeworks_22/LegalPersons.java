package Homeworks.homeworks_22;

public class LegalPersons extends Client {

    private final double Balance = 1526.89;

    @Override
    public void cashWithdrawal() {
        System.out.println("Комиссия за снятие средств составляет 1 %");

    }

    @Override
    public void accountReplenishment() {
        System.out.println("Комиссия на пополнение счета составляет 0%");
    }

    @Override
    public void accountBalance() {
        System.out.println("Твой баланс: " + Balance + "$.");

    }
}
