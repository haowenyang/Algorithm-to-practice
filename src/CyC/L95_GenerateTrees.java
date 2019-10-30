package CyC;


import java.util.ArrayList;
import java.util.List;

public class L95_GenerateTrees {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public List<TreeNode> generateTrees(int n) {
        if (n<1){
            return new ArrayList<>();
        }
        return generate(1,n);
    }
    public List<TreeNode> generate(int start,int end){
        List<TreeNode> list =new ArrayList<>();
       if (start>end){
           list.add(null);
           return list;
       }
        for (int i = start; i <=end ; ++i) {
            List<TreeNode> list1 = generate(start,i-1);
            List<TreeNode> list2 = generate(i+1,end);
            for (TreeNode treeNode1:list1) {
                for (TreeNode treeNode2:list2) {
                    TreeNode treeNode = new TreeNode(i);
                    treeNode.left=treeNode1;
                    treeNode.right=treeNode2;
                    list.add(treeNode);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> list = new L95_GenerateTrees().generateTrees(n);
        for (TreeNode treeNode:list) {
            LrR(treeNode);
        }
    }
    public static void LrR(TreeNode treeNode){
        if (treeNode!=null){
            LrR(treeNode.left);
            System.out.println(treeNode.val);
            LrR(treeNode.right);
        }
    }
}
