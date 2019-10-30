package CyC;

public class L153_FindMin {
    public int findMin(int[] nums) {
        if (nums.length==0)
            return Integer.MIN_VALUE;
        int l = 0, r =nums.length-1;
        while (l<r){
            int mid = l + (r-l)/2;
            if (nums[mid] <= nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int[] nums = {2,1};
        int result = new L153_FindMin().findMin(nums);
        System.out.println(result);
    }
}
