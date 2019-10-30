package CyC;

public class L53_MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length==0)
            return 0;
        int result = nums[0];
        int temp = result;
        for (int i = 1; i < nums.length; i++) {
            temp = temp<=0?nums[i]:temp+nums[i];
            result=Math.max(temp,result);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = new L53_MaxSubArray().maxSubArray(nums);
        System.out.println(result);
    }
}
