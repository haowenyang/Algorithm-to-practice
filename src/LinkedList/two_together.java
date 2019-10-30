package LinkedList;

import java.util.Stack;

public class two_together {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode linknode1=new ListNode(2);
        ListNode linknode2=new ListNode(4);
        ListNode linknode3=new ListNode(3);
        ListNode linknode4=new ListNode(5);
        ListNode linknode5=new ListNode(6);
        ListNode linknode6=new ListNode(4);
        linknode1.next=linknode2;
        linknode2.next=linknode3;
        linknode4.next=linknode5;
        linknode5.next=linknode6;
        ListNode listNode= sum(linknode1,linknode4);

            System.out.println(listNode.next.next.val);

    }
    public static ListNode sum(ListNode head1,ListNode head2){
        ListNode head=new ListNode(0);
        ListNode temp=head;
        int count=0;
        while (head1!=null||head2!=null){
            int x = (head1!= null) ? head1.val : 0;
            int y = (head2 != null) ? head2.val : 0;
            int sum = count+ x + y;
            count= sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (head1!= null) head1 = head1.next;
            if (head2!= null) head2 = head2.next;
        }
        if (count>0){
            temp.next=new ListNode(count);
        }
        return head.next;
    }

}
