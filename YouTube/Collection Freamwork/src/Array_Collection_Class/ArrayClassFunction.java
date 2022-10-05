package Array_Collection_Class;

import java.util.Arrays;

public class ArrayClassFunction {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int index = Arrays.binarySearch(arr,5);

        System.out.println("index of element 5 is --> "+index);

        System.out.println("_---------------SORT------------------");
        //By default, Quick Sort use ota hai
        Integer arr2 [] = {1,22,9,3,7,66,11,88,0,33,14,74,4};
        for (Integer el : arr2) {
            System.out.print(el+" ");
        }
        Arrays.sort(arr2);

        System.out.println();

        for (Integer el : arr2) {
            System.out.print(el+" ");
        }
        System.out.println();

        System.out.println("_---------------FILL------------------");
        Arrays.fill(arr2,12);

        System.out.println();

        for (Integer el : arr2) {
            System.out.print(el+" ");
        }



    }
}
