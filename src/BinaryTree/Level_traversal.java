package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;


public class Level_traversal {
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
        traversal(root);
    }
    public static void traversal(BinaryTreeNode root){

       Queue<BinaryTreeNode> queue=new LinkedList<>();
       queue.offer(root);
       while (root!=null){
           BinaryTreeNode temp=queue.poll();
           System.out.println(temp.data);
           if (root.left!=null){
               queue.offer(temp.left);
           }
           if (root.right!=null){
               queue.offer(temp.right);
           }
       }
    }
}
