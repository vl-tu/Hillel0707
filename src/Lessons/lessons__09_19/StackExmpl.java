package Lessons.lessons__09_19;

import java.util.Stack;

public class StackExmpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
