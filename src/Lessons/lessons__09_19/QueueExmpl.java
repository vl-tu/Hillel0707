package Lessons.lessons__09_19;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExmpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(22);


        queue.remove();
//        queue.poll();

        for (int i : queue) {
            System.out.println(i);
        }

        System.out.println("________________________________________________________________________");

        System.out.println(queue.element());
        System.out.println(queue.peek()); // вернет null. a не ошибку если нет элементов

        System.out.println("________________________________________________________________________");

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Banana");
        queue1.add("Abricot");
        queue1.add("Granad");

        while (queue1.peek() != null) {
            System.out.println(queue1.poll());
        }

        System.out.println(queue1.poll());

        System.out.println("________________________________________________________________________");


        Queue<String> queue2 = new PriorityQueue<>();
        queue2.add("Banana");
        queue2.add("Apricot");
        queue2.add("Granada");
        queue2.add("Apple");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
}
