package Sort;

public class Quick_sort {
    /*快速排序*/
    public static void main(String[] args) {
        int []array={0,2,1,2,1,0};
        qsort(array,0,array.length-1);
        for (int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
    public static void qsort (int arr[],int start,int end){
        int l=start;
        int r=end;
        if (l>=r){
            return;
        }
        int pivot=arr[l];
        while (l<r){
            while (l<r&&arr[r]>=pivot){
                r--;
            }
            swap(arr,l,r);
            while (l<r&&arr[l]<=pivot){
                l++;
            }
            swap(arr,l,r);
        }
        qsort(arr,start,l-1);
        qsort(arr,l+1,end);
    }
    public static void swap(int[] arr,int l,int r){
       int temp = arr[l];
       arr[l] = arr[r];
       arr[r] = temp;
    }
}
