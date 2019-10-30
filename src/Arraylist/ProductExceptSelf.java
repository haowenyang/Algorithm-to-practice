package Arraylist;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        int []arr=productExceptSelf(array);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public  static int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            output[i] = left;
            left *= nums[i];
        }
        for(int j=len-1;j>=0;j--){
          output[j]*=right;
          right*=nums[j];
        }
        return output;
    }
}
