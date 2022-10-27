package com.mySupplier;

import java.util.function.Supplier;

public class DemoS2 {

    public static int getNumber()
    {
        return 1000;
    }
    public static void main(String[] args)
    {
        Supplier<Integer> s4 = DemoS2::getNumber;
        System.out.println(s4.get());



    }
}
