import java.util.LinkedList;
import java.util.Queue;

public class _5Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(3);
        q.add(1);
        q.remove(); // remove 5
        q.peek();
        q.poll(); // pop
        System.out.println(q.isEmpty());
        if(q.size()>0)
        {
            //Perform oparation
        }


    }
}
