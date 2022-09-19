package Lessons.lessons_09_01.outerClasses;

public class Outer {
    int num;


    private class Inner_demo {
        public void print() {
            System.out.println("Это внутренний класс");
        }
    }

    void display_Inner() {
        Inner_demo inner_demo = new Inner_demo();
        inner_demo.print();
    }
}
