package work;

import java.util.List;
import java.util.stream.Collectors;

public class MethodsMapFilter {
    public static void main(String[] args) {
        List<String> names = List.of("pari","mal","koka","juju");

        List<String> newList = names.stream().filter(e->e.startsWith("k")).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> numbers = List.of(23,2,9,8,3,1,4,5);
       List<Integer> newNumbers = numbers.stream().map(el->el*el).collect(Collectors.toList());
        System.out.println(newNumbers);


        names.stream().forEach(e-> System.out.println(e));


        numbers.stream().sorted().forEach(System.out::println);






    }
}
