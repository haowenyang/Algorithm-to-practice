package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class sub {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        sub solution = new sub();
        List<List<Integer>> permute = solution.subsets(nums);
        for (int i = 0; i < permute.size(); i++) {
            System.out.println(permute.get(i));
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        back(nums,0, new ArrayList<Integer>(),res);
        return res;
    }
    public  static void back(int[] nums, int i, ArrayList list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            back(nums,j+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
