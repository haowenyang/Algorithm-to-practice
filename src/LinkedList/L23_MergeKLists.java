package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L23_MergeKLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val=x;
        }
    }
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode11=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        ListNode listNode4=new ListNode(4);
        ListNode listNode44=new ListNode(4);
        ListNode listNode5=new ListNode(5);
        ListNode listNode6=new ListNode(6);
        listNode1.next=listNode4;
        listNode4.next=listNode5;
        listNode11.next=listNode3;
        listNode3.next=listNode44;
        listNode2.next=listNode6;

    }
    public ListNode mergeKLists(ListNode[] lists) {
      if (lists.length==0){
          return null;
      }
      PriorityQueue<ListNode> queue=new PriorityQueue<>(new Comparator<ListNode>() {
          @Override
          public int compare(ListNode o1, ListNode o2) {
              return o1.val - o2.val;
          }
      });
      ListNode head=new ListNode(0);
      ListNode temp=head;
        for (ListNode l :lists) {
            if (l==null){
                continue;
            }
            queue.add(l);
        }
        while (!queue.isEmpty()){
            ListNode listNode=queue.poll();
            head.next=listNode;
            head=head.next;
            if (listNode.next!=null){
                queue.add(listNode.next);
            }
        }
        return temp.next;
    }
}
