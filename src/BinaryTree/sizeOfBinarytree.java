package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class sizeOfBinarytree {
    public static class BinaryTreeNode{
        private int data;
        private  BinaryTreeNode left;
        private BinaryTreeNode right;
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode();
        root.left = new BinaryTreeNode();
        root.right = new BinaryTreeNode();
        root.left.left = new BinaryTreeNode();
        root.left.right = new BinaryTreeNode();
        root.data = 1;
        root.left.data = 5;
        root.right.data = 3;
        root.left.left.data = 2;
        root.left.right.data = 4;
        int size=size(root);
        System.out.println(size);
    }
    public static int size(BinaryTreeNode root){
       /* if (root==null){
            return 0;
        }else {
            return (size(root.left)+1+size(root.right));
        }*/
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        BinaryTreeNode temp;
        if (root==null){
            return 0;
        }
        int count=0;
        queue.offer(root);
        while (!queue.isEmpty()){
            temp=queue.poll();
            count++;
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
        }
        return count;
    }
}
