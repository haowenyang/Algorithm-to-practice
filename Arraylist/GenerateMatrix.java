package Arraylist;

public class GenerateMatrix {
    public static void main(String[] args) {
        int n=3;
        int[][] t=generateMatrix(n);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println(t[i][j]);
            }
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        if (n==0){
            return new int[0][0];
        }
        int num=1;
        int left=0,right=n-1,up=0,down=n-1;
        while (left<=right&&up<=down){
            int i=left,j=up;
            for (j=left;j<=right;j++){
                matrix[i][j]=num++;
            }
            for (i=up+1,j--;i<=down;i++){
                matrix[i][j]=num++;
            }
            for (i--,j=down-1;j>=left;j--){
                matrix[i][j]=num++;
            }
            for (i=down-1,j++;i>=up+1;i--){
                matrix[i][j]=num++;
            }
            left++;
            up++;
            right--;
            down--;
        }
        return matrix;
    }
}
