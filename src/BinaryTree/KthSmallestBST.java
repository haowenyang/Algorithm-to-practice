package BinaryTree;

public class KthSmallestBST {
    public static class BinaryTreeNode{
        private int data;
        private  BinaryTreeNode left;
        private BinaryTreeNode right;
    }
    public static void main(String[] args) {
        BinaryTreeNode root= new BinaryTreeNode();
        root.left= new BinaryTreeNode();
        root.right= new BinaryTreeNode();
        root.data=4;
        root.left.data=2;
        root.right.data=5;
        System.out.println(small(root,2));
    }
    static int count=0;
    public static int small(BinaryTreeNode root,int k){
        BinaryTreeNode R= kthsmall(root,k);
        return R.data;
    }
    public static BinaryTreeNode kthsmall(BinaryTreeNode root,int k){
        if (root==null){
            return null;
        }
        BinaryTreeNode left=kthsmall(root.left,k);
        if (left!=null){
            return left;
        }
        count++;
        if (count==k){
            return root;
        }
        return kthsmall(root.right,k);
    }
}
