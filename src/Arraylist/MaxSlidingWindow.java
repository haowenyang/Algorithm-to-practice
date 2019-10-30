package Arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums={7,2,4};
        int []max=maxSlidingWindow(nums,2);
        for (int i=0;i<max.length;i++){
            System.out.println(max[i]);
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k){
        int []nu={};
        if(nums.length==0){
            return nu;
        }

        int []maxnum = new int[nums.length+1-k];
        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++)
                max = Math.max(max, nums[j]);
            maxnum[i] = max;
        }
        return maxnum;

    }
}
