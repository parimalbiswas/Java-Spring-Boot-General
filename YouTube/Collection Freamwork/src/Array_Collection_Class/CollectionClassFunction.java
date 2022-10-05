package Array_Collection_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassFunction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(55);

        System.out.println("min Element-> "+ Collections.min(list));
        System.out.println("Max Elem --> "+Collections.max(list));
        System.out.println("Freequency--> "+Collections.frequency(list,1));


        Collections.sort(list);
        System.out.println(list);

        // Reverse Order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
