public class _1WE_Arrat {
    public static void main(String[] args) {
        int row=2;
        int colum=3;
        int [][] arr = new int[row][colum];
        int val=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                arr[i][j]=val++;
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
