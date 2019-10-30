package CyC;

import java.util.*;

public class L102_LevelOrder {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        TreeNode binaryTreeNode1 =new TreeNode(3);
        TreeNode binaryTreeNode2=new TreeNode(9);
        TreeNode binaryTreeNode3=new TreeNode(20);
        TreeNode binaryTreeNode4=new TreeNode(15);
        TreeNode binaryTreeNode5=new TreeNode(7);
        binaryTreeNode1.left=binaryTreeNode2;
        binaryTreeNode1.right=binaryTreeNode3;
        binaryTreeNode3.left=binaryTreeNode4;
        binaryTreeNode3.right=binaryTreeNode5;
        List<List<Integer>> lists=new L102_LevelOrder().levelOrder(binaryTreeNode1) ;
        for (List i:lists) {
            System.out.println(i);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root==null)
            return lists;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int count = queue.size();
            while (count>0){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left!=null)
                    queue.add(treeNode.left);
                if (treeNode.right!=null)
                    queue.add(treeNode.right);
                count--;
            }
            lists.add(0,list);//头插法，即和普通的插入相比相当于逆序插入
        }
        return lists;
    }
}
