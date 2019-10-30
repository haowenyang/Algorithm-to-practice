package LinkedList;

public class rear_output_linkedlist {
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
        rearoutputlinkedlist(linknode1);
    }
    /*
    * 题目：从表尾开始输出链表
    * 思想：递归的方式解决||先逆置再遍历
    * */
    public static void rearoutputlinkedlist(ListNode head){
        if (head==null){
            return ;
        }
        rearoutputlinkedlist(head.next);
        System.out.println(head.val);
    }
}
