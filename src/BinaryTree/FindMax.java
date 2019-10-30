package BinaryTree;

public class FindMax {
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
        int max=findmax(root);
        System.out.println(max);
    }
    public static int findmax(BinaryTreeNode root) {
       int max=0;
        int left;
        int right;
        if (root!=null){
            int root_val=root.data;
            left=findmax(root.left);
            right=findmax(root.right);
            if (left>right){
                max=left;
            }
            else {
                max=right;
            }
            if (root_val>max){
                max=root_val;
            }
        }
        return max;
    }
}
