import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class _1Collection {
    public static void main(String[] args) {
        //Dynamic Array . Initial capacity 10. When 75% full auto Increase

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(0, 1, 2, 3);
        List<Integer> anotherList = Arrays.asList(5,5,6,6);
        list1.addAll(anotherList);

        System.out.println(list1.contains(5));


    }
}
