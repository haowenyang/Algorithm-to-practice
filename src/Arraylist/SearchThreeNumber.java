package Arraylist;

import java.util.Arrays;

public class SearchThreeNumber {
    /*
    * 给定一个n个整数的数组，查找3个整数，他们的和为k
    * */
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        search(array,9);
    }
    public static void search(int a[],int data){
        Arrays.sort(a);
        int j=0,k=0;
        for (int i=0;i<a.length;i++){
            for (j=i+1,k=a.length-1;j<k;){
                if (a[i]+a[j]+a[k]==data){
                    System.out.println("i:"+i+"j:"+j+"k:"+k);
                    return;
                }
                else if (a[i]+a[j]+a[k]<data){
                    j++;
                }
                else {
                    k--;
                }
            }
        }
    }
}
