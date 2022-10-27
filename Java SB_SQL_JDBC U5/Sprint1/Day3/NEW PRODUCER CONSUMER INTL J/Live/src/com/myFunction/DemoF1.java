package com.myFunction;

import java.util.function.Function;

public class DemoF1 {
    public static void main(String[] args) {

        Function<StudentF, String> f11 = new MyFunction();

        String str = f11.apply(new StudentF(10,"n2",700));
        System.out.println(str);


        System.out.println("-----------");

        Function<StudentF, String> f2 = s -> s.getMark() > 500 ? "Pass" : "Fail";
        System.out.println(f2.apply(new StudentF(10,"n2",450)));






    }
}
