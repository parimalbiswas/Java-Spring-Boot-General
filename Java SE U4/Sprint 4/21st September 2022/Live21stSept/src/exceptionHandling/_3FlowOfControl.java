package exceptionHandling;

public class _3FlowOfControl {

    public static void main(String[] args) {
        int i=-1;
        int arr[]=  new  int[10];
        try
        {
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Somehing"+e.getMessage());
        }
        System.out.println("Rest statement");

    }
}
