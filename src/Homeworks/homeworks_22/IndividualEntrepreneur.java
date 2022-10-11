package Homeworks.homeworks_22;

public class IndividualEntrepreneur extends Client {

    private final double Balance = 7532;

    @Override
    public void cashWithdrawal() {
        System.out.println("Комиссия за снятие средств составляет 0 %");

    }

    @Override
    public void accountReplenishment() {
        System.out.println("Комиссия на пополнение счета составляет 1% если сумма пополнения менее 1,000$.");
        System.out.println("Комиссия на пополнение счета составляет 0.5% если сумма пополнения равная или более 1,000$.");
    }

    @Override
    public void accountBalance() {
        System.out.println("Твой баланс: " + Balance + "$.");

    }
}
