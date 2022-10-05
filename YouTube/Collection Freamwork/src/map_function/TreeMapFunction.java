package map_function;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapFunction {
    public static void main(String[] args) {
        Map<String,Integer> number = new TreeMap<>();
        number.put("Three",3);
        number.put("Two",2);
        number.put("One",1);
        number.put("four",4);

        //It will sort an alphabetically order of key

        number.put("Two",4);


        //To avoide such replace mistake we can do a checker
        if (!number.containsKey("Three"))
        {
            number.put("Three",311);
        }
        System.out.println(number);
    }
}
