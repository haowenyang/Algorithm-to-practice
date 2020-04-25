package Main;


public class Main{
    public static void main(String[] args) {
        int[] nums =new int[]{2,6,9,3,1};
        mergesort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void mergesort(int[] nums){
        sort(nums,0,nums.length-1);
    }
    public static void sort(int[] nums,int l,int r){
        if (l==r){
            return;
        }
        int mid= l+(r-l)/2;
        sort(nums,0,mid);
        sort(nums,mid+1,r);
        merge(nums,l,r,mid);
    }
    public static void merge(int[] nums,int l,int r,int mid){
        int[] temp= new int[r-l+1];
        int i=0;
        int s =l;
        int s2=mid+1;
        while (s<=mid&&s2<=r){
            temp[i++]=nums[s]<=nums[s2]?nums[s++]:nums[s2++];
        }
        while (s<=mid){
            temp[i++]=nums[s++];
        }
        while (s2<=r){
            temp[i++]=nums[s2++];
        }
        for (int j = 0; j <temp.length; j++) {
            nums[l+j]=temp[j];
        }
    }
}