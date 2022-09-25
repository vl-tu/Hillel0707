package Lessons.lessons__09_19;

public class Person {
    private String fullName;
    private int age;
    private boolean retired;

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", retired=" + retired +
                '}';
    }

    public Person(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }
}
