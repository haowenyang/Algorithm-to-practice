package BinaryTree;

public class L124_MaxPathSum {
    public static int temp = Integer.MIN_VALUE;
    public static class TreeNode{
        private int data;
        private  TreeNode left;
        private TreeNode right;
        TreeNode(int x){
            this.data=x;
        }

    }
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        System.out.println(maxPathSum(treeNode1));
    }
    public  static int maxPathSum(TreeNode root){
        get_max(root);
        return temp;
    }
    public static int get_max(TreeNode treeNode) {
        if (treeNode==null){
            return 0;
        }
        int left=Math.max(0,get_max(treeNode.left));
        int right=Math.max(0,get_max(treeNode.right));
        int p=treeNode.data+left+right;
        temp=Math.max(temp,p);
        return treeNode.data+Math.max(left,right);
    }
}
