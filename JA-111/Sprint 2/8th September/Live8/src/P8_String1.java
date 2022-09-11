
public class P8_String1 {
    public static void main(String[] args) {
        String s1 = "value";  // String Literal
        String s2 =  new String("value");  // String with new Builder

        String x;
        String y;
        System.out.println(s1==s2);



        // Create in stringPool Area
        String s11 = "Value";  // String Literal
        String s22 = "Value";
        System.out.println(s11 == s22);

        // Create in Heap Area
        String s111 =  new String("Kolkata");
        String s222 =  new String("Kolkata");
        System.out.println(s111==s222);
    }
}
