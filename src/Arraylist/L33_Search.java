package Arraylist;

public class L33_Search {
    public static void main(String[] args) {
        int[] array={4,5,6,7,0,1,2};
        int target=2;
        int num=search(array,target);
        System.out.println(num);
    }
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[start]<=nums[mid]){
                if (target>=nums[0]&&target<nums[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            else {
                if (target<=nums[end]&&target>nums[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
