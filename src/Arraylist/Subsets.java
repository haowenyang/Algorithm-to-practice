package Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        sub solution = new sub();
        List<List<Integer>> permute = solution.subsets(nums);
        for (int i = 0; i < permute.size(); i++) {
            System.out.println(permute.get(i));
        }
    }
    /*层次遍历*/
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <res.size() ; j++) {
                List list=new ArrayList(res.get(j));
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
    }
}
