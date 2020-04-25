package CyC;

import java.util.HashMap;

public class L560_SubarraySum {
    public static void main(String[] args) {
        int[] nums =new int[]{1,1,1,-1};
        int k=2;
        System.out.println(subarraySum(nums,k));
    }
    public  static int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> hashMap =new HashMap<>();
       hashMap.put(0,1);
       int count =0,sum =0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            if (hashMap.containsKey(sum-k)){
                count+=hashMap.get(sum-k);
            }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
