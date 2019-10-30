package CyC;

public class L665_CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        if (nums.length<=2)
            return true;
        int count=0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]>=nums[i-1]) {
                continue;
            }
            if ( i-2>=0&& nums[i -2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,2,3};
        boolean bool = new L665_CheckPossibility().checkPossibility(nums);
        System.out.println(bool);
    }
}
