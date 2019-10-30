package LinkedList;

public class insertnode {
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

        ListNode newnode=new ListNode(5);
        ListNode head=insertnode(linknode1,newnode);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    /*
    * 在有序链表中插入节点
    * 算法思想：找到比新节点大的节点，将新节点插入这个节点的前面
    * */
    public static ListNode insertnode(ListNode head,ListNode newnode){
        if (head==null){
            return newnode;
        }
        ListNode temp=null;
        ListNode cpnode=head;
        while (cpnode!=null&&cpnode.val<newnode.val){
            temp=cpnode;
            cpnode=cpnode.next;
        }
        newnode.next=cpnode;
        temp.next=newnode;
        return head;
    }

}
