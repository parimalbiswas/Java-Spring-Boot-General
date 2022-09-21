package exceptionHandling;

public class _1ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("One");
        try
        {
            System.out.println(1/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Devide By Zero");
        }

        System.out.println("Two");
    }
}
