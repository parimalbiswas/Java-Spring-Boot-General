public class P2_WE_PrintSumAvarageOfArrayItems {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};

        int sum=0;
        for (int elem: arr){
            sum+=elem;

        }
        System.out.println(sum);
        System.out.println((double)sum/ arr.length);


    }
}
