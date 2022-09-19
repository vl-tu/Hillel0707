package Lessons.lessons_09_15;

import java.util.TreeSet;

public class TreeSetExmpl {
    public static void main(String[] args) {
        TreeSet<String> MyTreeSet = new TreeSet<>();
        TreeSet<Integer> MyTreeSet_2 = new TreeSet<>();


        MyTreeSet.add("c");
        MyTreeSet.add("a");
        MyTreeSet.add("n");
        MyTreeSet.add("h");
        MyTreeSet.add("o");
        MyTreeSet.add("e");
        MyTreeSet.add("k");

        MyTreeSet_2.add(1);
        MyTreeSet_2.add(5);
        MyTreeSet_2.add(2);
        MyTreeSet_2.add(0);

        System.out.println(MyTreeSet);
        System.out.println(MyTreeSet_2);
    }

}
