
// Default value of variable
public class Program1 {
    //this is non-static area
    int x=10; // inside a class : instance variable

    int instanceVariableWithoutValue;  // Instance variable get default value of int i.e. 0
    String string;  // Default value is null.

    public static void main(String[] args) {
    //this is static area

        int localVariableWithoutValue;


        int y= 5; // inside a method: local Variable

        System.out.println(y);
//        System.out.println(x);


        Program1 p1 = new Program1();
        System.out.println("instanceVariableWithoutValue "+p1.instanceVariableWithoutValue);  // Instance variable get default value of int i.e. 0 ZERO.
        // System.out.println(localVariableWithoutValue); // error Local variable must be insitialize

    }
}
