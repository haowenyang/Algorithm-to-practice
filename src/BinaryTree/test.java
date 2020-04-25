package BinaryTree;

public class test {
    public static class TreeNode{
        private int val;
        private  TreeNode left;
        private TreeNode right;
    }
    public static void main(String[] args) {
    }
    public int lastRemaining(int n, int m) {
        if (n==1)
            return 0;
        int flag=0;
        for (int i = 2; i <=n ; i++) {
            flag=(flag+m)%i;
        }
        return flag;
    }
}
