package LinkedList;

import java.util.LinkedList;

public class middle_node {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode linknode1=new ListNode(1);
        ListNode linknode2=new ListNode(3);
        ListNode linknode3=new ListNode(6);
        ListNode linknode4=new ListNode(4);
        ListNode linknode5=new ListNode(9);
        ListNode linknode6=new ListNode(5);
        linknode1.next=linknode2;
        linknode2.next=linknode3;
        linknode3.next=linknode4;
        linknode4.next=linknode5;
        linknode5.next=linknode6;
        System.out.println(middlenode(linknode1).val);

    }
    /*题目：找到链表的中间节点
    思路：使用双指针，并且快指针的移动速度是满指针的二倍，当快指针移动到结尾时，慢指针所指节点就是中间节点*/

    public static ListNode middlenode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (fast.next!=null&&fast.next.next==null){
            slow=slow.next;
        }
        return slow;
    }


    /*public static ListNode middlenode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        int temp=0;
        while (fast.next!=null){
            if (temp==0){
                fast=fast.next;
                temp=1;
            }
            else if (temp==1){
                fast=fast.next;
                slow=slow.next;
                temp=0;
            }
        }
        return slow;
    }*/
}
