package BinaryTree;

public class BuildBinaryTree {
    public static class BinaryTreeNode{
        private int data;
        private  BinaryTreeNode left;
        private BinaryTreeNode right;
    }
    public static void main(String[] args) {
        int []inorder={4,2,5,1,6,3};
        int []preorder={1,2,4,5,3,6};
        BinaryTreeNode root=buildtree(preorder,inorder);
        pre(root);
    }
   public static void  pre(BinaryTreeNode root){
        if (root==null){
            return;
        }
        else {
            System.out.println(root.data);
            pre(root.left);
            pre(root.right);
        }
   }
   public static BinaryTreeNode buildtree(int preOrder[],int  inOrder[]){
        BinaryTreeNode root=build(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
        return root;
   }
    public static BinaryTreeNode build(int preOrder[],int inOrder[],int pre_start,int pre_end,int in_start,int in_end){
        BinaryTreeNode root=new BinaryTreeNode();
        if (pre_start>pre_end||in_start>in_end){
            return null;
        }
        root.data=preOrder[pre_start];
        int index=in_start;
        while (inOrder[index]!=root.data&&index<=in_end){
            index++;
        }
        int leftlength=index-in_start;
        root.left=build(preOrder,inOrder,pre_start+1,pre_start+leftlength,in_start,leftlength+in_start-1);
        root.right=build(preOrder,inOrder,pre_start+leftlength+1,pre_end,leftlength+in_start+1,in_end);
        return root;
    }

   /* public static void pre(BinaryTreeNode root){
        if (root!=null){
            System.out.println(root.data);
            pre(root.left);
            pre(root.right);
        }

    }
    public static BinaryTreeNode  buildtree(int preorder[],int inorder[]){
        BinaryTreeNode root=build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        return root;
    }
    public static BinaryTreeNode build(int preorder[],int inorder[],int pre_start,int pre_end,int in_start,int in_end){
        BinaryTreeNode root=new BinaryTreeNode();
        if (pre_start>pre_end||in_start>in_end){
            return null;
        }
        root.data=preorder[pre_start];
        int index=in_start;

        while (index<=in_end&&inorder[index]!=root.data){
            index++;
        }
        int leftlen=index-in_start;
        root.left=build(preorder,inorder,pre_start+1,pre_start+leftlen,in_start,index-1);
        root.right=build(preorder,inorder,pre_start+leftlen+1,pre_end,index+1,in_end);
        return root;
    }*/


}

