package collections.queue;

import java.util.PriorityQueue;

public class UsePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(9);

        System.out.println(queue);
    }
}
