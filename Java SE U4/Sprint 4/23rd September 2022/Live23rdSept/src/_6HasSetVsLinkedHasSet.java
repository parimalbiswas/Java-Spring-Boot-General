import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _6HasSetVsLinkedHasSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();

        hs.add("Delhi");
        hs.add("rfgt");
        hs.add("dg");
        hs.add("Delhi"); // Duplicate Not inseted
        hs.add("uuu");
        hs.add(null);
        hs.add("ll");

        System.out.println(hs);




        lhs.add("Delhi");
        lhs.add("rfgt");
        lhs.add("dg");
        lhs.add("Delhi"); // Duplicate Not inseted
        lhs.add("uuu");
        lhs.add(null);
        lhs.add("ll");

        System.out.println(lhs);

    }
}
