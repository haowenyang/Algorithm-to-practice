package CyC;

import java.util.ArrayList;
import java.util.List;

public class L29_1_SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = new ArrayList<>();
        list = spiralOrder(matrix);
        for (int i :
            list ) {
            System.out.println(i);
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list = new ArrayList<>();
        if (matrix.length==0)
            return list;
        int pl=0, pr=0, ql=matrix.length-1, qr=matrix[0].length-1;
       while (pl<=ql&&pr<=qr){
           print(matrix,pl++,pr++,ql--,qr--,list);
       }
       return list;
    }
    public static void print(int[][] matrix,int pl,int pr,int ql,int qr,List<Integer> list) {
        if (pl==ql){
            for (int i = pr; i <=qr; i++) {
                list.add(matrix[pl][i]);
            }
        }
        else if (pr==qr){
            for (int i = pl; i <=ql ; i++) {
                list.add(matrix[i][pr]);
            }
        }else {
            int l = pl;
            int r = pr;
            while (r<qr){
                list.add(matrix[pl][r]);
                r++;
            }
            while (l<ql){
                list.add(matrix[l][qr]);
                l++;
            }
            while (r>pr){
                list.add(matrix[ql][r]);
                r--;
            }
            while (l>pl){
                list.add(matrix[l][pr]);
                l--;
            }
        }
    }

}
