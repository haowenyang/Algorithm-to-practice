package LinkedList;

import java.util.List;

public class L61_RotateRight {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
        }
    }
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=null;
        ListNode node=rotateRight(listNode1,10);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        int length=0;
        if (head==null||head.next==null||k==0){
            return head;
        }
        ListNode sp=head;
        while (sp!=null){
            length++;
            sp=sp.next;
        }
        k=k%length;
        if (k==0){
            return head;
        }
        int move=0;
        ListNode temp=head;
        ListNode pre=new ListNode(0);
        pre.next=temp;
        while (move<length-k){
            pre=pre.next;
            temp=temp.next;
            move++;
        }
        ListNode result=temp;
        pre.next=null;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return result;
    }
}
