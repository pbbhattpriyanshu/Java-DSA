import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Chaya"); // adding in queue
        queue.offer("Pankaj");
        queue.offer("piyush");
        queue.offer("ashu");

        // System.out.println(queue.peek());  // Chaya, it just to show the item, does not remove any item

        // queue.poll(); // Removes Chaya from queue
        // queue.poll(); // Removes Pankaj from queue

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("Chaya"));
    }
}
