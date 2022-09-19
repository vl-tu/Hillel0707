package Lessons.lessons_09_01.outerClasses;

public class main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display_Inner();

        System.out.println("_____________________________________________________________-");

        OuterLocalMethod outerLocalMethod = new OuterLocalMethod();
        outerLocalMethod.my_Method();
    }


}
