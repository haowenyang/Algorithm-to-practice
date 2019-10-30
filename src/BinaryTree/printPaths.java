package BinaryTree;

public class printPaths {
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
        int paths[]=new int[256];
        printpaths(root,paths,0);
    }

    public static void printpaths(BinaryTreeNode node, int[] paths,int Len){
        if (node==null){
            return;
        }
        paths[Len++]=node.data;
        if (node.left==null&&node.right==null){
            printarray(paths,Len);
        }
        else {
            printpaths(node.left,paths,Len);
            printpaths(node.right,paths,Len);
        }
    }
    private static void printarray(int[] ints,int len){
        for (int i=0;i<len;i++){
            System.out.print(ints[i]+"");
        }
        System.out.println();
    }
}
