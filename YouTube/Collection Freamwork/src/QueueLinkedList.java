import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(5);
        queue.offer(6);
        queue.offer(1);
        System.out.println(queue);

        //queue.poll();
        System.out.println(queue.poll());
        System.out.println(queue);

        //peak mean which element preesnt next to out
        System.out.println(queue.peek());

    }
}
