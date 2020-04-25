package CyC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L51_SolveNQueens {
    public static void main(String[] args) {
        List<List<String>> lists=new ArrayList<>();
        lists=solveNQueens(4);
        for (List<String> l :
                lists) {
            System.out.println(l);
        }
    }
    private static List<List<String>> res =new ArrayList<>();
    private static boolean[] j ;
    private static boolean[] jio1;
    private static boolean[] jio2;
    public static List<List<String>> solveNQueens(int n) {
        j=new boolean[n];
        jio1=new boolean[2*n-1];
        jio2=new boolean[2*n-1];
        char[][] board =new char[n][n];
        back(n,0,board);
        return res;
    }
    public static void back(int n,int i,char[][] board){
        if (n==i){
            List<String> list =new ArrayList<>();
            for (int j = 0; j <n ; j++) {
                list.add(new String(board[j]));
            }
            res.add(list);
            return;
        }
        Arrays.fill(board[i],'.');
        for (int k = 0; k <n ; k++) {
            if (!j[k]&&!jio1[k+i]&&!jio2[i-k+n-1]){
                board[i][k]='Q';
                j[k]=true;
                jio1[k+i]=true;
                jio2[i-k+n-1]=true;
                back(n,i+1,board);
                board[i][k]='.';
                j[k]=false;
                jio1[k+i]=false;
                jio2[i-k+n-1]=false;
            }
        }
    }

}
