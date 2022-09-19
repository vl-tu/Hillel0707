package Mentor_lection.lessons_08_24.Task_2;

import javax.xml.namespace.QName;
import java.util.SplittableRandom;

public class Person {
    protected String firstname;
    protected String lastname;
    protected String address;

    public Person(String firstnamename, String lastname, String address) {
        this.address = address;
        this.firstname = firstnamename;
        this.lastname = lastname;
    }

    public void display() {
        System.out.println(this.firstname + " " + this.lastname);
        System.out.println("Address: " + this.address);
    }
}
