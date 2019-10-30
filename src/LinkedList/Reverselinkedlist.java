package LinkedList;

import BinaryTree.KthSmallestBST;

public class Reverselinkedlist {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode linknode1 = new ListNode(1);
        ListNode linknode2 = new ListNode(3);
        ListNode linknode3 = new ListNode(6);
        ListNode linknode4 = new ListNode(4);
        ListNode linknode5 = new ListNode(9);
        ListNode head=reverselinkedlist(linknode1);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }


    /*
    * 逆置链表
    * 算法思想:迭代的思想||递归的思想
    * */
    public static ListNode reverselinkedlist(ListNode head){
        if (head==null){
            return null;
        }
        ListNode temp=null;
        ListNode next=null;
        while (head!=null){
            next=head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        return temp;
    }

}



        /*ListNode temp=null;
        ListNode nextPro=null;
        while (head!=null){
            nextPro=head.next;
            head.next=temp;
            temp=head;
            head=nextPro;
        }
        return temp;*/

    /*递归public static  ListNode reverselinkedlist(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode temp=reverselinkedlist(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }*/

