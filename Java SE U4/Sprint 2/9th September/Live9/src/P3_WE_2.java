class RetLargest{
    int fun(int [] arr)
    {
        int max=Integer.MIN_VALUE;

        if (arr.length == 0)
        {
            System.out.println("Empty");
            return max;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max =  arr[i];
            }
        }
        return  max;
    }
}

public class P3_WE_2 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,70,8,9,10};

        RetLargest r1= new RetLargest();
        int x =r1.fun(arr);
        System.out.println(x);

    }
}
