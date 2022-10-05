package work;
//Create a List and Filter all even numbers from List

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(112);
        list.add(12);
        list.add(21);
        list.add(18);
        list.add(23);
        list.add(7);



        //without stream------------------------

        List<Integer> listEven = new ArrayList<>();

        for (Integer el : list)
        {
            if (el%2==0)
            {
                listEven.add(el);
            }
        }

        System.out.println(list);
        System.out.println(listEven);



        //Using Stream API
        Stream<Integer> stream = list.stream();
        List<Integer> newList = stream.filter(elem->elem%2==0).collect(Collectors.toList());
        System.out.println(newList);

        // method 2 of stream API to filter even elem of an array
        List<Integer> newList2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList2);


        // stream API to filter more than 50 number of an array
        List<Integer> more50 = list.stream().filter(el->el>10).collect(Collectors.toList());
        System.out.println(more50);




    }
}
