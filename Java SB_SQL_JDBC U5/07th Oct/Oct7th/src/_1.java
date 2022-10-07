import java.util.Arrays;

public class _1 {

    public static void main(String[] args) {
        int arr[] = {10,20,130,45,1,98,12};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        //Arrays.sort();
        //Bineary Seach Work only sorted array
        int index = Arrays.binarySearch(arr,1);
        System.out.println(index);
    }
}
