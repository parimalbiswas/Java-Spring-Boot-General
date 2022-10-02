import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
    List<Integer> list =  Arrays.asList(1,2,5,1,9,5,0,7,4,5,9);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        Collections.reverse(list);
        System.out.println(list);
    }
}
