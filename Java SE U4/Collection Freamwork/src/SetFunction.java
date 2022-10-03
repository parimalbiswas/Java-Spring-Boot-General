import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetFunction {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(1);
        set.add(15);
        // Duplicate element Not allowed. But Its UnOrdered
        System.out.println(set);

        set.remove(15);

        System.out.println(set);

        System.out.println(set.contains(20));
        System.out.println(set.contains(0));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);


        System.out.println("-----------------------------------------");


    }
}