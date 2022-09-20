public class _4InitializeMatrix {
    public static void main(String[] args) {
        int [] arr = {2,3};
        int [][] m = {
                {0,1,2},
                {3,4},
                {5}
        };
        System.out.println(m[1][1]);


        // SOLVE YOU PROBLEM
        for (int[] elem: m){
            for (int elem2 : elem) {
                System.out.println(elem2);

            }
        }



    }
}
