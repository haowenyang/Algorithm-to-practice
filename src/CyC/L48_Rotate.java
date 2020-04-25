package CyC;

public class L48_Rotate {
    public static void main(String[] args) {
     int[][]  matrix =
             {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
     rotate(matrix);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static void rotate(int[][] matrix) {
        int temp = 0;
        int n =matrix.length;
        for (int i = 0; i < (n+1)/2; i++) {
            for (int j = i; j <n-i-1 ; j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;
            }
        }
    }
}
