package BinaryTree;

public class LCA {
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
        BinaryTreeNode l=lca(root,root.left.left,root.left.right);
        System.out.println(l.data);
    }
    public static BinaryTreeNode lca(BinaryTreeNode root,BinaryTreeNode a,BinaryTreeNode b){
       BinaryTreeNode left,right;
       if (root==null){
           return null;
       }
       if (root==a||root==b){
           return root;
       }
       left=lca(root.left,a,b);
       right=lca(root.right,a,b);
       if (left!=null&&right!=null){
           return root;
       }
       else {
           if (left!=null){
               return left;
           }else {
               return right;
           }
       }
    }
}
