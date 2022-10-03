import java.util.ArrayList;
import java.util.List;

public class AddFunction {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(56);

        System.out.println(al);

        al.add(20);
        System.out.println(al);

        al.add(1,50);
        System.out.println(al);

        List<Integer> al2 = new  ArrayList<>();
        al2.add(601);
        al2.add(113);
        al2.add(569);

        System.out.println(al2);


        /////////Margine to aarray List///
        al.addAll(al2);
        System.out.println(al);


        System.out.println(al.get(3));


    }
}
