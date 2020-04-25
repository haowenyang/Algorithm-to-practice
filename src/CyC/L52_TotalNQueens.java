package CyC;

public class L52_TotalNQueens {

    private static  boolean[] j;
    private static  boolean[] jio1;
    private static  boolean[] jio2;
    private static int res =0;
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }

    public static int totalNQueens(int n) {
        j=new boolean[n];
        jio1=new boolean[2*n-1];
        jio2=new boolean[2*n-1];
        return back(n,0);
    }
    public static int back(int n ,int i){
        if (n==i){
            return res++;
        }
        for (int k = 0; k <n ; k++) {
            if (!j[k]&&!jio1[k+i]&&!jio2[i-k+n-1]){
                j[k]=true;
                jio1[k+i]=true;
                jio2[i-k+n-1]=true;
                back(n,i+1);
                j[k]=false;
                jio1[k+i]=false;
                jio2[i-k+n-1]=false;
            }
        }
        return res;
    }
}
