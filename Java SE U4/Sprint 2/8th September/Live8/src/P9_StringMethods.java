


public class P9_StringMethods {
    public static void main(String[] args) {
        String s1 =  "Hi";
        String s2 =  "Hello";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        String s3 =  "String";

        System.out.println(s3.charAt(3));
        System.out.println(s3.substring(1));
        System.out.println(s3.substring(1,3)); // last one excluded

        String s5 = "HelloThereHowAreYou";
        System.out.println(s5.indexOf('T'));
        System.out.println(s5.indexOf("Are"));
        System.out.println(s5.lastIndexOf('e'));


        // ==  compare the memory address
        // Equals() method compare the content
        String  x1 = "xyz";
        String  x2 = "xyz";
        String  x3 = "def";
        String  x4 = "Xyz";
        System.out.println(x1==x2);
        System.out.println(x1.equals(x2));
        System.out.println(x1==x3);
        System.out.println(x1.equals(x3));

        System.out.println(x1.equalsIgnoreCase(x4));



        System.out.println("   fdgrg dfsdf dfdf    ".trim());
        System.out.println("   fdgrg dfsdf dfdf    ".replace('f','K'));




    }
}
