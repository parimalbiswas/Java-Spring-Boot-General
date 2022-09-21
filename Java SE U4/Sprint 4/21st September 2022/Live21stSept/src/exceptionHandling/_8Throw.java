package exceptionHandling;

public class _8Throw {
    public static void main(String[] args) {
        int age =10;
        if(age<18)
        {
            throw new ArithmeticException("Below 18 not allowed");
        }
        else
        {
            System.out.println("You are eligable");
        }
    }
}
