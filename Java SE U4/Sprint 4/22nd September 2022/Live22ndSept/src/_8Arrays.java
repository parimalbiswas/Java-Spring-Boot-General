import java.util.Arrays;
import java.util.List;

public class _8Arrays {
    public static void main(String[] args) {
        int a[] = {4,2,0,6,7,2,3,6};
        Arrays.sort(a);
        System.out.println("After SOtting");



        System.out.println(Arrays.toString(a));

        List<Integer> integerList = Arrays.asList(4,2,5);

        System.out.println(integerList);


        //Search
        Arrays.binarySearch(a,4);
        //int b[]= new int[a.length];
        int b[] = Arrays.copyOf(a,4);
        System.out.println(Arrays.toString(b));

    }
}
