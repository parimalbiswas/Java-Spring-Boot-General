import java.util.ArrayList;
import java.util.List;

public class RemoveFunction {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(56);
        al.add(20);
        al.add(601);
        al.add(113);
        al.add(569);

        System.out.println(al);

        al.remove(2);
        System.out.println(al);




        al.remove(Integer.valueOf(601));
        System.out.println(al);

        Object arrxx = al.clone();
        System.out.println(arrxx);


        al.clear();
        System.out.println(al);

    }
}
