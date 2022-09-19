package Mentor_lection.lessons_08_24.Task_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Davidson", "bestCity", "5000");
        Customer customer = new Customer("Max", "Toron", "newCity", "5987456");

        System.out.print("Customer: ");
        customer.display();
        System.out.println("------------------------------------------------------");
        System.out.print("Employee: ");
        employee.display();
    }
}
