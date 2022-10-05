import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetFunction {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(5);
        set1.add(20);
        set1.add(15);
        set1.add(1);
        set1.add(15);
        // Duplicate element Not allowed. But Its UnOrdered
        System.out.println(set1);

        set1.remove(15);

        System.out.println(set1);

        System.out.println(set1.contains(20));
        System.out.println(set1.contains(0));

        System.out.println(set1.isEmpty());
        System.out.println(set1.size());

        set1.clear();
        System.out.println(set1);
    }
}
