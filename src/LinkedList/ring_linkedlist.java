package LinkedList;

public class ring_linkedlist {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode linknode1=new ListNode(1);
        ListNode linknode2=new ListNode(3);
        ListNode linknode3=new ListNode(4);
        ListNode linknode4=new ListNode(6);
        ListNode linknode5=new ListNode(9);
        linknode1.next=linknode2;
        linknode2.next=linknode3;
        linknode3.next=linknode4;
        linknode4.next=linknode5;
        linknode5.next=linknode3;
        System.out.println(ring_linklist(linknode1));
    }
    /*题目：求链表是否存在环
    * 算法思想：设置两个移动速度不同的指针，当存在环时，速度快的指针必能追上移动速度慢点指针
    * */
    public static int  ring_linklist(ListNode head){
        if (head==null){
            return 0;
        }
        ListNode fastnode=head;
        ListNode slownode=head;
        boolean isringlinkedlist=false;
        while (fastnode!=null&&fastnode.next!=null&&slownode!=null){
            slownode=slownode.next;
            fastnode=fastnode.next.next;
            if (fastnode==slownode){
                isringlinkedlist=true;
                break;
            }
        }
        if (isringlinkedlist){
             slownode=head;
             while (slownode!=fastnode){
                 fastnode=fastnode.next;
                 slownode=slownode.next;
             }
             return slownode.val;
        }
        return  0;
    }
}
