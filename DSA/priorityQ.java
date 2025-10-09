import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQ {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(3.7);
        queue.offer(3.1);
        queue.offer(4.7);
        queue.offer(2.0);
        queue.offer(3.5);
        queue.offer(2.7);
        queue.offer(4.2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
