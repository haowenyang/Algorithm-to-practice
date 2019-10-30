package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNodeinBinarytree {
    public static class BinaryTreeNode{
        private int data;
        private  BinaryTreeNode left;
        private BinaryTreeNode right;
    }
    public static void main(String[] args) {
        BinaryTreeNode root= new BinaryTreeNode();
        root.left= new BinaryTreeNode();
        root.right= new BinaryTreeNode();
        root.left.left= new BinaryTreeNode();
        root.left.right= new BinaryTreeNode();
        root.data=1;
        root.left.data=5;
        root.right.data=3;
        root.left.left.data=2;
        root.left.right.data=4;
        BinaryTreeNode deep=deepest(root);
        System.out.println(deep.data);
    }
    public static BinaryTreeNode deepest(BinaryTreeNode root){
        BinaryTreeNode temp = null;
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        if (root==null){
            return null;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            temp=queue.poll();
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
        }
        return temp;
    }
}
