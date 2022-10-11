package Homeworks.homeworks_23;

public class Individual extends Client {

    private final double Balance = 1052.55;

    @Override
    public void cashWithdrawal() {
        System.out.println("Комиссия за снятие средств составляет 0 %");
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
