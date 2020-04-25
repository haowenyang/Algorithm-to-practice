package CyC;

public class L200_NumIslands {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid) {
        if (grid.length==0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (grid[i][j]=='1'){
                    result++;
                    g(grid,i,j,m,n);//进入感染函数
                }
            }
        }
        return result;
    }
    public static void  g(char[][] grid,int i,int j,int m,int n){
        if (i<0||i>=m||j<0||j>=n||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';//将当前位置感染为2，并对上下左右进行递归判断
        g(grid,i+1,j,m,n);
        g(grid,i-1,j,m,n);
        g(grid,i,j-1,m,n);
        g(grid,i,j+1,m,n);
    }
}
