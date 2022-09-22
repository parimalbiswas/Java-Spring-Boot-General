import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _6IterateOverMap {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,4);
        map.put(9,4);
        System.out.println(map.get(2));

//        map.clear();//erase all
        map.put(2,20); // replace 2 value. Unique one value can be present
        map.get(100);

        System.out.println(map);

        //KeySet Way
        Set<Integer> keyset = map.keySet();
        for (Integer key : keyset) {
            System.out.println(key);
        }
        //EntrySet Way
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry:entrySet){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        //Lamda Way
        map.forEach((k,v)-> System.out.println(k+"---->"+v));


        //4th Way
        map.keySet().forEach(key -> System.out.println(key+"---!!->"+ map.get(key)));
    }
}
