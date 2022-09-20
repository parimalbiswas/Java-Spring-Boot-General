

public class _1TwoDArray {
    public static void main(String[] args) {
//        System.out.println("c");
        int row=3;
        int colum=4;
        int[][] matrix = new int[row][colum];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                matrix[i][j] = 10;
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println(matrix[i][j]);
            }
        }


    }

}
