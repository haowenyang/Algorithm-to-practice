package CyC;

public class L34_SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result =new int[2];
        result[0]=-1;
        result[1]=-1;
        if (nums.length==0)
            return result;
        int l = 0,r = nums.length;
        while (l<r){
            int mid = l +(r-l)/2;
            if(nums[mid]>=target){
                r = mid;
            }
            else{
                l=mid+1;
            }
        }
        if (l == nums.length)
            result[0]=-1;
        else
            result[0]=nums[l]==target?l:-1;
        int s = 0,e = nums.length;
        while (s<e){
            int mid = s +(e-s)/2;
            if(nums[mid]<=target){
                s = mid+1;
            }
            else{
                e=mid;
            }
        }
        if (s==0)
            result[1]=-1;
        else
            result[1]=nums[s-1]==target?s-1:-1;
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] result = new L34_SearchRange().searchRange(nums,target);
        System.out.println(result[0]+"--------"+result[1]);
    }
}
