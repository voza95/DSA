package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println("Queue of all the elements: \n" + queue);
        System.out.println("Check the head of the queue \"" + queue.peek() + "\"");
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println("Queue contains Harold: "+ queue.contains("Harold"));
        System.out.println("Check the head of the queue \"" + queue.peek() + "\"");
        
    }
}
