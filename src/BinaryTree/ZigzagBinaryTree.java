package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigzagBinaryTree {
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
        zigzag(root);
    }
    public static void zigzag(BinaryTreeNode root){
       if (root==null){
           return;
       }
       int temp=1;
       Queue<BinaryTreeNode> queue1=new LinkedList<>();
       Queue<BinaryTreeNode> queue2=new LinkedList<>();
       BinaryTreeNode node;
       queue1.offer(root);
       while (!queue1.isEmpty()){
           node=queue1.poll();
           if (node!=null){
               System.out.println(node.data);
               if (temp!=0){
                   if (node.right!=null){
                       queue2.offer(node.right);
                   }
                   if (node.left!=null){
                       queue2.offer(node.left);
                   }
               }
               else {
                   if (node.left!=null){
                       queue2.offer(node.left);
                   }
                   if (node.right!=null){
                       queue2.offer(node.right);
                   }
               }
           }
           if (queue1.isEmpty()){
               temp=1-temp;
               Queue<BinaryTreeNode> queue;
               queue=queue1;
               queue1=queue2;
               queue2=queue;
           }
       }
        /*if (root==null){
            return;
        }
        BinaryTreeNode temp;
        int lefttoright=1;
        Stack<BinaryTreeNode> stack1=new Stack<>();
        Stack<BinaryTreeNode> stack2=new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            temp=stack1.pop();
            if (temp!=null){
                System.out.println(temp.data);
            }
            if (lefttoright!=0){
                if (temp.left!=null){
                    stack2.push(temp.left);
                }
                if (temp.right!=null){
                    stack2.push(temp.right);
                }
            }
            else {
                if (temp.right!=null){
                    stack2.push(temp.right);
                }
                if (temp.left!=null){
                    stack2.push(temp.left);
                }
            }
            if (stack1.isEmpty()){
                lefttoright=1-lefttoright;
                Stack<BinaryTreeNode> tempstack;
                tempstack=stack1;
                stack1=stack2;
                stack2=tempstack;
            }
        }
*/
    }
}
