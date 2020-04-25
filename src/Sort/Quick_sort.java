package Sort;

import java.util.ArrayList;
import java.util.List;

public class Quick_sort {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>();
        if (matrix.length==0){
            return list;
        }
        int tr=0,tc=0,dr=matrix.length-1,dc=matrix[0].length-1;
        boolean temp =false;
        while(tr<=dr){
            print(matrix,tr,tc,dr,dc,list,temp);
            tr = tc==dc?tr+1:tr;
            tc = tc==dc?tc:tc+1;

        }
        return list;
    }
    public static void print(int[][] matrix,int tr,int tc ,int dr,int dc,List<Integer> list,boolean temp){
        if (tr==dr){
            for (int i = tc; i <=dc ; i++) {
                list.add(matrix[tr][i]);
            }
        }else if (tc==dc){
            for (int i = tr; i <=dr ; i++) {
                list.add(matrix[i][dc]);
            }
        }else {
            int p =tr,q=tc;
            while (q!=dc){
                list.add(matrix[tr][q]);
                q++;
            }
            while (p!=dr){
                list.add(matrix[p][dc]);
                p++;
            }
            while (q!=tc){
                list.add(matrix[dr][q]);
                q--;
            }
            while (p!=tr){
                list.add(matrix[p][tr]);
                p--;
            }
        }
    }
}
