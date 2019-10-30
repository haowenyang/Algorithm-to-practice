package LinkedList;

public class ReversePairRecursive {
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
        linknode1.next = linknode2;
        linknode2.next = linknode3;
        linknode3.next = linknode4;
        linknode4.next = linknode5;
        ListNode head=reverse(linknode1);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
/*
* 问题:逐对逆置链表
* 思路：递归||迭代
* */
   /* public static ListNode reverse(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        else {
        ListNode temp=null;
        temp=head.next;
        head.next=head.next.next;
        temp.next=head;
        head=temp;
        head.next.next=reverse(head.next.next);
        return head;
    }}*/

    public static ListNode reverse(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode next=null;
        ListNode temp=null;
        while (head!=null&&head.next!=null) {
            if (next!=null){
                next.next.next=head.next;
            }
            next=head.next;
            head.next=head.next.next;
            next.next=head;
            if (temp==null) {
                temp=next;
            }
            head=head.next;
        }
        return temp;
    }
}
