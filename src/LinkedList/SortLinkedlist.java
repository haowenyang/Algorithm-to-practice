package LinkedList;

public class SortLinkedlist {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode linknode1=new ListNode(1);
        ListNode linknode2=new ListNode(4);
        ListNode linknode3=new ListNode(3);
        ListNode linknode4=new ListNode(9);
        ListNode linknode5=new ListNode(2);
        linknode1.next=linknode2;
        linknode2.next=linknode3;
        linknode3.next=linknode4;
        linknode4.next=linknode5;
        ListNode root=sortList(linknode1);
        while (root!=null){
        System.out.println(root.val);
        root=root.next;}
    }
    public static ListNode sortList(ListNode head){
        if (head == null || head.next == null)
            return head;
       ListNode slow=head;
       ListNode fast=head.next;
       while (fast!=null&&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       ListNode temp=slow.next;
       slow.next=null;
       ListNode h=new ListNode(0);
       ListNode result=h;
       ListNode left=sortList(head);
       ListNode right=sortList(temp);
       while (left!=null&&right!=null){
           if (left.val<right.val){
               h.next=left;
               left=left.next;
           }else {
               h.next=right;
               right=right.next;
           }
           h=h.next;
       }
       h.next=left!=null?left:right;
       return result.next;
    }
}
