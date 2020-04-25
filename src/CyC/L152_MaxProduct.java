package CyC;

public class L152_MaxProduct {
    public static void main(String[] args) {

    }
    public int maxProduct(int[] nums) {
        if (nums.length==0)
            return 0;
        int res = Integer.MIN_VALUE;
        int min =1,max=1;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]<0){
                int tem = min;
                min= max;
                max=tem;
            }
            max=Math.max(nums[i],nums[i]*max);
            min=Math.min(nums[i],nums[i]*min);
            res=Math.max(max,res);
        }
        return res;
    }
}
