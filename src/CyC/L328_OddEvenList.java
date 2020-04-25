package CyC;

public class L328_OddEvenList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=null;
        ListNode listNode=oddEvenList(listNode1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        if (head==null||head.next==null||head.next.next==null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode temp = second;
        while (temp!=null&&temp.next!=null){
            first.next=temp.next;
            first=first.next;
            temp.next=first.next;
            temp=temp.next;
        }
        first.next=second;
        return head;
    }

}
