package Mentor_lection.lessons_08_24.Task_2;

public class Customer extends Person {
    private String bankData;

    public Customer(String firstnamename, String lastname, String address, String bankData) {
        super(firstnamename, lastname, address);
        this.bankData = bankData;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bank account: " + this.bankData);
    }
}