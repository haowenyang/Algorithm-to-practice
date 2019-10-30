package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static void main(String[] args) {
        int [][]array={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list=spiralOrder(array);
        for (int i:list){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        int m=matrix.length;//代表行数
        int n=matrix[0].length;//代表列数ss
        List<Integer> lists=new ArrayList<>();
        lists=spiral(matrix);
        return lists;
    }
    public static List<Integer> spiral(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        if (m==0){
            return list;
        }
        int left=0,right=n-1,up=0,down=m-1;
        while (left<=right&&up<=down){
            int i=left,j=up;
            for (; i <=right; i++) {
               list.add(matrix[j][i]);
            }
            for (j = up+1,i--; j <=down; j++) {
               list.add(matrix[j][i]);
            }
            if (left<right&&up<down){
            for ( i = right-1,j--; i >= left; i--) {
               list.add(matrix[j][i]);
            }
            for (j = down-1,i++; j >= up+1; j--) {
                list.add(matrix[j][i]);
            }
            }
            left++;
            up++;
            right--;
            down--;
        }
        return list;
    }
}
