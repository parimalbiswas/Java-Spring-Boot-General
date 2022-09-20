package com.live.inputTake;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc1.nextInt();
        System.out.println("Enter Your Name");
        String name = sc1.next();

        System.out.println(age+" "+name);

        sc1.close();



    }
}
