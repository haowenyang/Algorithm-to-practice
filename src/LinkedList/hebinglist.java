package LinkedList;

import java.util.LinkedList;

public class hebinglist {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
 }

    public static void main(String[] args) {
        ListNode l11=new ListNode(1);
        ListNode l12=new ListNode(2);
        ListNode l13=new ListNode(4);
        ListNode l14=new ListNode(6);
        ListNode l15=new ListNode(9);
        l11.next=l12;
        l12.next=l13;
        l13.next=l14;
        l14.next=l15;
        ListNode l21=new ListNode(1);
        ListNode l22=new ListNode(3);
        ListNode l33=new ListNode(4);
        l21.next=l22;
        l22.next=l33;
        ListNode c=mergeTwoLists(l11,l21);
        while (c!=null){
            System.out.println(c.val);
            c=c.next;
        }
    }
    /*
    * 题目：合并两个有序链表
    * 思路：递归||迭代
    * 递归：*/
    public  static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=null;
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1.val<=l2.val){
            result=l1;
            result.next=mergeTwoLists(l1.next,l2);
        }else {
            result=l2;
            result.next=mergeTwoLists(l1,l2.next);
        }
        return result;
    }

   /*迭代*/ /*public  static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1==null){
            temp.next=l2;
        }
        else{
            temp.next=l1;
        }
        return head.next;
    }*/

}