package BinaryTree;

public class IsBST {
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
        root.data=4;
        root.left.data=2;
        root.right.data=5;
        root.left.left.data=1;
        root.left.right.data=3;
        System.out.println(isBST(root));
    }
    static BinaryTreeNode temp=null;
    public static Boolean isBST(BinaryTreeNode root){
        if (root==null){
            return true;
        }
        if (!isBST(root.left)){
            return false;
        }
        if (temp!=null&&temp.data>=root.data) {
            return false;
        }
        temp=root;
        return (isBST(root.right));
    }
}
