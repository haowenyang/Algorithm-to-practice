package CyC;

public class L922_SortArrayByParityII {
    public static void main(String[] args) {
        int[] num = new int[]{4,2,5,7};
        num = sortArrayByParityII(num);
        for (int i:
             num) {
            System.out.println(i);
        }
    }
    public static int[] sortArrayByParityII(int[] A) {
       int startj = 1;
        for (int i = 0; i < A.length; i=i+2) {
           if (A[i]%2==1){
               while (A[startj]%2==1){
                   startj+=2;
               }
               swap(A,i,startj);
            }else
                continue;
        }
        return A;
    }
    public static void swap(int[] num,int i,int j){
        int t = num[i];
        num[i]=num[j];
        num[j]=t;
    }
}
