
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(6.2);
        queue.offer(2.5);
        queue.offer(1.5);
        queue.offer(2.0);
        queue.offer(4.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
