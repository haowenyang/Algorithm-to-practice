package Play_the_algorithmic_interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L199_RightSideView {


    public static void main(String[] args) {
        L103_ZigzagLevelOrder.TreeNode binaryTreeNode1 =new L103_ZigzagLevelOrder.TreeNode(1);
         L103_ZigzagLevelOrder.TreeNode binaryTreeNode2=new  L103_ZigzagLevelOrder.TreeNode(2);
         L103_ZigzagLevelOrder.TreeNode binaryTreeNode3=new  L103_ZigzagLevelOrder.TreeNode(3);
         L103_ZigzagLevelOrder.TreeNode binaryTreeNode4=new  L103_ZigzagLevelOrder.TreeNode(5);
         L103_ZigzagLevelOrder.TreeNode binaryTreeNode5=new  L103_ZigzagLevelOrder.TreeNode(4);
        binaryTreeNode1.left=binaryTreeNode2;
        binaryTreeNode1.right=binaryTreeNode3;
        binaryTreeNode2.right=binaryTreeNode4;
        binaryTreeNode3.right=binaryTreeNode5;
        List<Integer> lists=new L199_RightSideView().rightSideView(binaryTreeNode1) ;
        for (int i:lists) {
            System.out.println(i);
        }
    }
    public List<Integer> rightSideView(L103_ZigzagLevelOrder.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root==null)
            return list;
        Queue<L103_ZigzagLevelOrder.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int sum = queue.size();
            LinkedList<Integer> linkedList = new LinkedList<>();//如果想用getlast或者getfirst将list改为linkedlist
            while (sum>0){
                L103_ZigzagLevelOrder.TreeNode treeNode = queue.poll();
                linkedList.add(treeNode.val);
                if (treeNode.left!=null)
                    queue.add(treeNode.left);
                if (treeNode.right!=null)
                    queue.add(treeNode.right);
                sum--;
            }
            list.add(linkedList.getLast());
        }
       return list;
    }
}
