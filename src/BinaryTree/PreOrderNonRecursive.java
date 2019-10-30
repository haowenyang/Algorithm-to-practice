package BinaryTree;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Stack;

public class PreOrderNonRecursive {
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
        Recursive(root);
    }
    public static void Recursive(BinaryTreeNode root){
        Stack stack=new Stack();
       while (true){
           while (root!=null){
               System.out.println(root.data);
               stack.push(root);
               root=root.left;
           }
           if (stack.isEmpty()){
               break;
           }
           root=(BinaryTreeNode) stack.pop();
           root=root.right;
       }
       return;
    }
}
