package CyC;

public class L88_Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sum=m+n-1;
        int p=m-1;
        int q=n-1;
        while (p>=0&&q>=0){
            nums1[sum--]=nums1[p]>=nums2[q]?nums1[p--]:nums2[q--];
        }
        System.arraycopy(nums2,0,nums1,0,q+1);
        for (int k:nums1) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        L88_Merge l88_merge=new L88_Merge();
        int[] nums1 = new int[7];
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=3;
        int[] nums2 = {2,5,6,7};
        int m=3;
        int n=3;
        l88_merge.merge(nums1,m,nums2,n);
    }
}
