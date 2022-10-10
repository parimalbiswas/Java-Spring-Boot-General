package MethodReference.Example3;

public class DemoMR3 {
    public static void main(String[] args) {
        IntrMR3 i1 = (String s) ->{
            System.out.println(s);
        };
        i1.printSome("5");



        IntrMR3 i2 = System.out::println;
        i2.printSome("HHOOO");
    }
}
