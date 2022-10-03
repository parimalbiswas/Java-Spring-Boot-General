import java.util.ArrayList;
import java.util.Iterator;

public class SetValueArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(56);
        al.add(20);
        al.add(601);
        al.add(113);
        al.add(569);

        System.out.println(al);

        al.set(1,500);
        System.out.println(al);

        System.out.println(al.contains(501));
        System.out.println(al.contains(500));


        for (int i = 0; i < al.size(); i++) {
            System.out.println("Normal For Loop "+al.get(i));
        }
        System.out.println("---------------------------");
        for (Integer elem : al) {
            System.out.println(" For Each Loop "+elem);
        }
        System.out.println("---------------------------");
        Iterator<Integer> it = al.iterator();
        while (it.hasNext())
        {
            System.out.println("Collection Itarator "+it.next());
        }


    }
}
