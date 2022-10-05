import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueFunction {
    public static void main(String[] args) {
        Queue<Integer> prQueuw1 = new PriorityQueue<>(Comparator.reverseOrder()); //Reverse Order
        prQueuw1.offer(2);
        prQueuw1.offer(5);
        prQueuw1.offer(6);
        prQueuw1.offer(1);
        System.out.println(prQueuw1);

        Queue<Integer> prQueuw = new PriorityQueue<>();
        prQueuw.offer(2);
        prQueuw.offer(5);
        prQueuw.offer(6);
        prQueuw.offer(1);

        System.out.println(prQueuw);

        prQueuw.poll();
        System.out.println(prQueuw);

        System.out.println(prQueuw.peek());
    }
}
