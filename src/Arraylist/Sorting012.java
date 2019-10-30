package Arraylist;

public class Sorting012 {

    public static void main(String[] args) {
        int array[]={1,2,0,0,1,2};
        int a[]=sorting012(array,0,array.length-1);
        for (int i:a){
            System.out.println(i);
        }
    }
    public static int[] sorting012(int array[],int start,int end){
        int left=start;
        int right=end;
        while (left<start){
            while (left<start&&array[left]<1){
                left++;
            }
            while (left<start&&array[right]>1){
                right--;
            }
            if (left<start&&array[left]==array[right]){
                left++;
            }
            else {
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
        if (left-1>start){
            sorting012(array,start,left-1);
        }
        if (right+1<end){
            sorting012(array,right+1,end);
        }
        return array;
    }
}
