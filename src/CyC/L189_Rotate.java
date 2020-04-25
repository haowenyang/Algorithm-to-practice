package CyC;

public class L189_Rotate {
    public static void main(String[] args) {
        int[] nums =new int[]{1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for (int i:
                nums ) {
            System.out.println(i);
        }
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        if (k==0){
            return;
        }
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    public static void reverse(int[] nums, int s,int e) {
        while (s<e){
            int temp =nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}
