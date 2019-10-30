package BinaryTree;

public class BuildBST {
    public static class BinaryTreeNode{
        private int data;
        private  BinaryTreeNode left;
        private BinaryTreeNode right;
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        BinaryTreeNode no=build(array);
        inOrder(no);
    }
    public static void inOrder(BinaryTreeNode root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public static BinaryTreeNode build(int array[]){
        BinaryTreeNode node=buildBST(array,0,array.length-1);
        return node;
    }
    public static BinaryTreeNode buildBST(int array[] ,int left,int right){
        BinaryTreeNode newNode=new BinaryTreeNode();
        if (left>right){
            return null;
        }
        if (left==right){
            newNode.data=array[left];
            newNode.left=null;
            newNode.right=null;
        }
        else {
            int mid=left+(right-left)/2;
            newNode.data=array[mid];
            newNode.left=(buildBST(array,left,mid-1));
            newNode.right=buildBST(array,mid+1,right);
        }
        return newNode;
    }
}
