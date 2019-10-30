package LinkedList;

public class Judge_linkedlist_parity {
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
        Judgelinkedlistparity(linknode1);
    }
    /*
     * 题目：判断链表长度的奇偶
     * 思想：设置一个一次走两步的指针，走到最后时如果该节点为空，则为偶，否则为奇
     * */
    public static int Judgelinkedlistparity(ListNode head){
      ListNode fast=head;
      while (fast!=null&&fast.next!=null){
          fast=fast.next.next;
      }
      if (fast==null){
          return 0;
      }
      return 1;
    }
}
