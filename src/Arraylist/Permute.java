package Arraylist;

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

public class Permute {
    // curSize 表示当前的路径 path 里面有多少个元素

    private void back(int[] nums, boolean[] visited, int temp, int len, Stack<Integer> path, List<List<Integer>> res) {
        if (temp==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
          if (!visited[i]){
              path.push(nums[i]);
              visited[i]=true;
              back(nums,visited,temp+1,len,path,res);
              visited[i]=false;
              path.pop();
          }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int len=nums.length;
        List<List<Integer>> lists=new ArrayList<>();
        if (len==0){
            return lists;
        }
        Stack stack=new Stack();
        boolean []visit = new boolean[len];
        back(nums,visit,0,len,stack,lists);
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Permute solution = new Permute();
        List<List<Integer>> permute = solution.permute(nums);
        for (int i = 0; i < permute.size(); i++) {
            System.out.println(permute.get(i));
        }
    }
}
