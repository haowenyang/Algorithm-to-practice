package CyC;

public class L141_HasCycle {
    public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
    public static boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (slow!=null&&fast!=null&&fast.next!=null){
            if (slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        listNode1.next=listNode2;
        listNode2.next=listNode1;
        System.out.println(hasCycle(listNode1));
    }
}
