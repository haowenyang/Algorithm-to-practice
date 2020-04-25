package Stack;

public class Linkedlist_implementation_stack {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    private ListNode headNode;
    public Linkedlist_implementation_stack(){
        this.headNode=new ListNode(1);
    }
    public void Push(int data){
        if (headNode==null){
            headNode=new ListNode(data);
        }else if (headNode.val==0){
            headNode.val=data;
        }else {
            ListNode listNode=new ListNode(data);
            listNode.next=headNode;
            headNode=listNode;
        }
    }
}

