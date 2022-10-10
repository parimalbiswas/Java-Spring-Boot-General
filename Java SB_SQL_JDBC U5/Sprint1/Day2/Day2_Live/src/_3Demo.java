import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _3Demo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Delhi","Kolkata","Delhi","Chennai","Delhi","Mumbai");


//        Collections -- Its a Class
//        Collection -- Its an Interface

        int result = Collections.frequency(colors,"Delhi");
        System.out.println(result);

        //Natural Sort methods -- O(n) -- Quick Sort Internally
        Collections.sort(colors);
        System.out.println(colors);




    }
}
