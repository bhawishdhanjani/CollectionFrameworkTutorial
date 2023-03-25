package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.offer("d");
        var front = queue.peek();
        System.out.println(front);
        System.out.println(queue);
        front = queue.poll();
        System.out.println(front);
        System.out.println(queue);
    }
}
