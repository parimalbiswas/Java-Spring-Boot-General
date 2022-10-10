package MethodReference.Example2;

public class DemoMR2 {
    public static void main(String[] args) {
        //Using Long Lamda Exprassion
        IntrMR2 i1 = (String number) ->{
            int result = Integer.parseInt(number);
            return result+1;
        };
        System.out.println(i1.getTheNumber("50"));

        //Using Short Lamda Exprassion
        IntrMR2 i2 = number -> Integer.parseInt(number);
        System.out.println(i2.getTheNumber("50")+2);

        //Using Method Reference
        //Refereing ParseInt Method of Interger Class
        IntrMR2 i3 = Integer::parseInt;
        System.out.println(i3.getTheNumber("50")+10);



    }
}
