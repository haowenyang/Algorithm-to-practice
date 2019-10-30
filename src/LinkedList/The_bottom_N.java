package LinkedList;

public class The_bottom_N {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode l11=new ListNode(1);
        ListNode l12=new ListNode(2);
        ListNode l13=new ListNode(4);
        ListNode l14=new ListNode(6);
        ListNode l15=new ListNode(9);
        l11.next=l12;
        l12.next=l13;
        l13.next=l14;
        l14.next=l15;
        System.out.println(find_botton_n(l11,4));
    }

    /*题目：求链表倒数第n个结点
    算法思想：进行两次遍历，第一遍遍历得到链表的长度，第二次遍历得到第length+1-n的数值
    */
    public  static int find_botton_n(ListNode head,int n){
        ListNode temp=head;
        int length=0;
        if (head==null) {
            return 0;
        }
        while (head!=null){
            length++;
            head=head.next;
        }
        if (n>length||n<1){
            return 0;
        }
        int count=0;
        int num=0;
        while (temp!=null){
            if(count==length-n){
                num= temp.val;
            }
            count++;
            temp=temp.next;
        }
        return num;
    }
}
