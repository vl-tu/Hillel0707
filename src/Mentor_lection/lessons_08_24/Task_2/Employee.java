package Mentor_lection.lessons_08_24.Task_2;

public class Employee extends Person {
    private String salary;

    public Employee(String firstnamename, String lastname, String address, String salary) {
        super(firstnamename, lastname, address);
        this.salary = salary;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
    }
}
