

public class _3NumberOfRowandColum {
    static void numberOfRadC(int[][] matrix)
    {
        System.out.println("No of rows");
        System.out.println(matrix.length);
        System.out.println("Number of colums");
        System.out.println(matrix[0].length);
    }
    public static void main(String[] args) {
        int row=20;
        int colum=30;
        int [][] matrix = new int[row][colum];
        numberOfRadC(matrix);
    }
}
