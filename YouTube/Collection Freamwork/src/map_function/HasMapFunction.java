package map_function;

import java.util.HashMap;
import java.util.Map;

public class HasMapFunction {
    public static void main(String[] args) {
        Map<String,Integer> number = new HashMap<>();
        number.put("One",1);
        number.put("Two",2);
        number.put("Three",3);
        number.put("four",4);

        //It will update old key value pairs

        number.put("Two",4);


        //To avoide such replace mistake we can do a checker
        if (!number.containsKey("Three"))
        {
            number.put("Three",311);
        }
        System.out.println(number);


        //Iterator in map
        System.out.println("---------/Iterator in map/-----------");
        for (Map.Entry<String,Integer> elem: number.entrySet())
        {
            System.out.println(elem);

            System.out.println(elem.getKey());
            System.out.println(elem.getValue());
            System.out.println(elem.getClass());
        }


        System.out.println("---------/KEY ONLY Iterator in map/-----------");
        for (String keyElem : number.keySet())
        {
            System.out.println(keyElem);
        }

        //Iterator in map for KEY ONLY
        System.out.println("---------/VALUE ONLY Iterator in map/-----------");
        for (Integer keyElem : number.values())
        {
            System.out.println(keyElem);
        }


        //VALUE present or not
        System.out.println("---------/VALUE present or not in map/-----------");
        System.out.println(number.containsValue(3));
        System.out.println(number.isEmpty());
    }
}
