package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderBinarytree {
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
        levelorder(root);
    }
    public static void levelorder(BinaryTreeNode root){
        Queue<BinaryTreeNode> queue=new LinkedList<>();
        Stack stack=new Stack();
        BinaryTreeNode temp;
        if (root==null){
            return;
        }
        while (!queue.isEmpty()){
            temp=queue.poll();
            if (temp.right!=null){
                queue.offer(temp.right);
            }
            if (temp.left!=null){
                queue.offer(temp.left);
            }
            stack.push(temp);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
