package com.myConsumr;

import java.util.Arrays;
import java.util.List;

public class DemoC3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit","Ravi","Mohit","Annand");
        names.forEach(el -> System.out.println(el.toUpperCase()));
        System.out.println("---------------------------");
        names.forEach(System.out::println);
    }
}
