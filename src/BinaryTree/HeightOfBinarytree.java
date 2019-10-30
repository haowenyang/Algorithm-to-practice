package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinarytree {
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
        int height=Height(root);
        System.out.println(height);
    }
    public static int Height(BinaryTreeNode root){
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        BinaryTreeNode temp;
        int count=1;
        if (root==null){
            return 0;
        }
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()){
            temp=queue.poll();
            if (temp==null){
                if (!queue.isEmpty()){
                    queue.offer(null);
                    count++;
                }
            }
            else {
                if (temp.left!=null){
                    queue.offer(temp.left);
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
        return count;

       /* int left,right;
        if (root==null){
            return 0;
        }
        left=Height(root.left);
        right=Height(root.right);
        if (left>right){
            return left+1;
        }
        else {
            return right+1;
        }*/
    }
}


