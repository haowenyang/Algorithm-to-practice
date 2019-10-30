package Arraylist;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] array={-1,2,1,-4};
        int target=1;
        int num=threeSumClosest(array,target);
        System.out.println(num);
    }
    public static int threeSumClosest(int[] nums, int target) {

        if (nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int n=nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int m=nums[i]+nums[left]+nums[right];
                if (Math.abs(m-target)<Math.abs(n-target)){
                    n=m;
                }
                if (m>target){
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return n;
    }
}
