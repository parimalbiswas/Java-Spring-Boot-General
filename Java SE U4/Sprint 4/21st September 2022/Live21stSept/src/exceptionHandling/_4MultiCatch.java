package exceptionHandling;

public class _4MultiCatch {
    public static void main(String[] args) {
        int i=-1;
        int d=0;
        int arr [] = new int[1];

        try{
            //System.out.println(i/d);
            System.out.println(arr[i]);
        }
        catch (ArithmeticException ae){
            System.out.println("aritch matic");
        }
        catch (ArrayIndexOutOfBoundsException eioob)
        {
            System.out.println("eioob");
        }
        catch (Exception e)
        {
            System.out.println("Generic Exception");
        }
    }
}
