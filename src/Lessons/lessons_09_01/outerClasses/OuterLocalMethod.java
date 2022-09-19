package Lessons.lessons_09_01.outerClasses;

public class OuterLocalMethod {
    void my_Method() {
        int num = 888;

        // внутренний класс
        class MethodInner_Demo {

            // внутренний метод класса
            void print() {
                System.out.println("Это метод внутреннего класса" + " " + num);
            }
        }

        MethodInner_Demo methodInner_demo = new MethodInner_Demo();
        methodInner_demo.print();
    }
}
