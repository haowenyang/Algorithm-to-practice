package Play_the_algorithmic_interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L103_ZigzagLevelOrder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        /*见CYC102*/
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root==null)
            return lists;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int temp=1;
        while (!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            int count = queue.size();;
            if(temp==1){
                while (count>0){
                    TreeNode treeNode = queue.poll();
                    list.add(treeNode.val);
                    if (treeNode.left != null)
                        queue.add(treeNode.left);
                    if (treeNode.right != null)
                        queue.add(treeNode.right);
                    count--;
                    if (count==0){
                        temp=-temp;
                    }
                }
            }
            else {
                while (count>0){
                    TreeNode treeNode = queue.poll();
                    list.add(0,treeNode.val);
                    if (treeNode.left != null)
                        queue.add(treeNode.left);
                    if (treeNode.right != null)
                        queue.add(treeNode.right);
                    count--;
                    if (count==0){
                        temp=-temp;
                    }
                }
            }
           lists.add(list);
        }
        return lists;
    }
}

