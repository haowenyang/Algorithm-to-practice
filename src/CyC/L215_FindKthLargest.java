package CyC;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L215_FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        if (nums.length==0||k>nums.length){
            return 0;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>((n1,n2)-> n1 - n2);//lambda表达式
        for (int i = 0; i <nums.length ; i++) {
            queue.add(nums[i]);
        }
        while (queue.size()>k){
            queue.poll();
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        int[] array={3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findKthLargest(array,k));
    }
}
