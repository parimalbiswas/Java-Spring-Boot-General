import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _7TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> hasmap = new HashMap<>();
        hasmap.put(0,0);
        hasmap.put(1,1);
        hasmap.put(2,4);
        hasmap.put(9,4);
        System.out.println(hasmap);
        hasmap.forEach((k,v)-> System.out.println(k+"---->"+v));

        System.out.println("--------------------------------------");

        Map<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(0,0);
        treeMap.put(1,1);
        treeMap.put(2,4);
        treeMap.put(9,4);
        System.out.println(treeMap);
        treeMap.forEach((k,v)-> System.out.println(k+"--!-->"+v));
    }
}
