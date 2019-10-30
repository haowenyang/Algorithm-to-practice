package BinaryTree;

public class Search_element {
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
        Boolean bool=search(root,4);
        System.out.println(bool);
    }
    public static Boolean search(BinaryTreeNode root,int data){
        Boolean temp;
        if (root==null){
            return false;
        }
        else {
            if (data==root.data){
                return true;
            }else {
                temp=search(root.left,data);
                if (temp==false){
                    return search(root.right,data);
                }
                else {
                    return true;
                }
            }
        }

    }
}

