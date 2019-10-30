package BinaryTree;

import sun.security.krb5.internal.PAData;

public class SortedListToBST {
    public static class  ListNode{
        private int val;
        private ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public static class TreeNode{
        private int val;
        private  TreeNode left;
        private TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static void main(String[] args) {
        ListNode linknode1 = new ListNode(1);
        ListNode linknode2 = new ListNode(3);
        ListNode linknode3 = new ListNode(4);
        ListNode linknode4 = new ListNode(6);
        ListNode linknode5 = new ListNode(9);
        linknode1.next = linknode2;
        linknode2.next = linknode3;
        linknode3.next = linknode4;
        linknode4.next = linknode5;
        TreeNode root= sortedListToBST(linknode1);
        in(root);
    }
    public static void in(TreeNode root){
        if (root==null){
            return;
        }
        in(root.left);
        System.out.println(root.val);
        in(root.right);
    }
    public static TreeNode sortedListToBST(ListNode head){
        if(head == null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val);
        ListNode slow = head,fast = head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        while(fast != null && fast.next != null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.right = sortedListToBST(slow.next);
        prev.next = null;
        root.left = sortedListToBST(head);
        return root;
    }
}
