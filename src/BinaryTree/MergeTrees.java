package BinaryTree;

public class MergeTrees {
    /* leetcode第617题 */
    public static class TreeNode{
        private int val;
        private  TreeNode left;
        private TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public static TreeNode merge(TreeNode t1, TreeNode t2){
        if (t1==null){
            return t2;
        }
        if (t2==null){
            return t1;
        }
        t1.val+=t2.val;
        t1.left=merge(t1.left,t2.left);
        t2.right=merge(t1.right,t2.right);
        return t1;
    }
}
