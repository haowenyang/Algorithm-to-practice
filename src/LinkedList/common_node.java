package LinkedList;

public class common_node {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode linknode1=new ListNode(1);
        ListNode linknode2=new ListNode(2);
        ListNode linknode3=new ListNode(4);
        ListNode linknode4=new ListNode(6);
        ListNode linknode5=new ListNode(9);
        linknode1.next=linknode2;
        linknode2.next=linknode3;
        linknode3.next=linknode4;
        linknode4.next=linknode5;
        ListNode linknode6=new ListNode(3);
        ListNode linknode7=new ListNode(8);
        linknode6.next=linknode7;
        linknode7.next=linknode4;
        System.out.println(commonnode(linknode1,linknode6).val);
    }
    /*
    题目：编写一个程序，找到两个单链表相交的起始节点。
    算法思想：先遍历链表，求得链表的长度。然后让长的链表先走多出的节点数目。之后两个链表一起走，当地址相同时则返回；
    */
    public static ListNode commonnode(ListNode headA,ListNode headB){
        ListNode headA1=headA;
        ListNode headB2=headB;
        if (headA1==null||headB2==null){
            return null;
        }
        int headA_length=0;
        int headB_length=0;
        while (headA1!=null){
            headA_length++;
            headA1=headA1.next;
        }
        while (headB2!=null){
            headB_length++;
            headB2=headB2.next;
        }
        int temp=headA_length-headB_length;
        if (temp>0){
            while (temp>0){
                temp--;
                headA=headA.next;
            }
        }
        else if (temp<0){
            temp=-temp;
            while (temp>0){
                temp--;
                headB=headB.next;
            }
        }
        while (headA!=null&&headB!=null){
            if (headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;

        }
        return null;
    }

}
