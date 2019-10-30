package LinkedList;

public class Circular_linkedlist_segmentation {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
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
        linknode5.next = linknode1;
        ListNode head1=null;
        ListNode head2=null;
        SplitList(linknode1,head1,head2);
    }
    public static void SplitList(ListNode head,ListNode head1,ListNode head2){
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=head&&fast.next.next!=head){
            fast=fast.next.next;
            slow=slow.next;
        }
        if (fast.next.next==head){
            fast=fast.next.next;
        }
        head1=head;
        if (head.next!=head){
            head2=slow.next;
        }
        fast.next=slow.next;
        slow.next=head;

    }
}
