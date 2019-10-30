package Arraylist;

public class UniquePaths {
    public static void main(String[] args) {
        int m=3,n=3;
        int num=uniquePaths(m,n);
        System.out.println(num);
    }
    public static int uniquePaths(int m, int n) {
        if (m==0||n==0){
            return 0;
        }
        int [][]dp=new int[n][m];
        for (int j = 0,i=0; i <n ; i++) {
            dp[i][j]=1;
        }
        for (int i = 0,j=0; j <m ; j++) {
            dp[i][j]=1;
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <m ; j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}
