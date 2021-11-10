package queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head : " + queue.element());
        System.out.println("head : " + queue.peek());

        System.out.println("iterating the queue elements:");
        for (String string : queue) {
            System.out.println(string);
        }

        System.out.println("head : " + queue.remove());
        System.out.println("head : " + queue.poll());

        System.out.println("after removing two elements:");
        for (String string : queue) {
            System.out.println(string);
        }
    }
}
