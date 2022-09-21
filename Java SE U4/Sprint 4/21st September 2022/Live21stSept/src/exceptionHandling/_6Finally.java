package exceptionHandling;

import java.util.Scanner;

public class _6Finally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextBoolean();
        int index =1;
        int arr[] = new int[1];

        try{
            int x = arr[index];
        }
        catch (Exception e)
        {
            System.out.println("Catch Block");
        }
        finally {  // To close resourse
            System.out.println("Closeing the scanner");
            scanner.close();  // To scanner resourse close.
            System.out.println("Finally This will always execute");

        }

    }
}
