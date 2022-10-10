package MethodReference.Example1;



public class DemoMR1 {
    public static void fun1(String s)
    {
        System.out.println("Inside STATIC Fun1 of Demo");
        System.out.println("The value of s is "+s);
    }

    public void fun2(String s)
    {
        System.out.println("Inside NON STATIC Fun2 of Demo");
        System.out.println("The value of s is "+s);
    }

    public DemoMR1() {
    }

    public DemoMR1(String s)
    {
        System.out.println("Inside CONSTRACTOR  of Demo");
        System.out.println("The value of s is "+s);
    }

    public static void main(String[] args) {

        //Using Lamda Expreation
        IntrMR1 i1 = message-> System.out.println(message);
        i1.sayHellow("Welcome to Lamda Expreation");


        System.out.println("----------------");

        /*
            --we can take a reference of a non-static method using object::methodName

            --we can take a reference of a static method using ClassName::methodName

            --we can take a reference of a constructor also using ClassName::new
         */

        //Using Method Reference
        IntrMR1 i2 = DemoMR1::fun1;    //Refer Static method
        i2.sayHellow("WelCome to Method Reference");

        System.out.println("----------------");

        IntrMR1 i3 = new DemoMR1()::fun2;  //Refer Non Static method
        i3.sayHellow("WelCome to Method Reference");



        System.out.println("----------------");

        //IMP: If Interface method has a return type
        //we can not refer constrator
        //Because Constractor dont have return type
        IntrMR1 i4 = DemoMR1::new;  //Refer Constractor
        i4.sayHellow("WelCome to Method Reference");
    }


}
