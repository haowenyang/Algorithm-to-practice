package CyC;

public class L540_SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length==0)
            return 0;
        int l = 0,r=nums.length-1;
        while (l<r){
            int mid = l + (r-l)/2;
            if (mid%2==1)
                mid--;
            if (nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else {
                r=mid;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1};
        int result = new L540_SingleNonDuplicate().singleNonDuplicate(nums);
        System.out.println(result);
    }
}
