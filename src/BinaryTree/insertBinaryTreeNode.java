package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class insertBinaryTreeNode {
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
        insert(root,6);
    }
    public static void insert(BinaryTreeNode root,int data){
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        BinaryTreeNode temp;
        BinaryTreeNode newNode=new BinaryTreeNode();
        newNode.left=null;
        newNode.right=null;
        if (root==null){
            root=newNode;
            return;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            temp=queue.poll();
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            else {
                temp.left=newNode;
                return;
            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
            else {
                temp.right=newNode;
                return;
            }
        }
    }
}
