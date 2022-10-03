import java.util.ArrayDeque;

public class ArrayDequeueFunction {
    public static void main(String[] args) {
        ArrayDeque<Integer> aqd = new ArrayDeque<>();

        aqd.offer(23);
        aqd.offer(12);
        aqd.offer(25);
        aqd.offer(2);

        System.out.println(aqd);

        System.out.println(aqd.peek());
        System.out.println(aqd.peekFirst()+" "+aqd.peekLast());


        System.out.println(aqd.poll());

        System.out.println(aqd);

        System.out.println(aqd.pollFirst());
        System.out.println(aqd.pollLast());


    }
}
