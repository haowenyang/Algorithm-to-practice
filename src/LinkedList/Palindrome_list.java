package LinkedList;

public class Palindrome_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode linknode1 = new ListNode(1);
        ListNode linknode2 = new ListNode(1);
      ListNode linknode3= new ListNode(2);
        ListNode linknode4 = new ListNode(1);
        linknode1.next = linknode2;
        linknode2.next = linknode3;
        linknode3.next = linknode4;
        Boolean bool=isPalindrome(linknode1);
        System.out.println(bool);
    }
    /*
    * 题目：判断链表是否为回文链表
    * 思路：定义快慢指针，快指针走到最后时，慢指针为中间结点，逆置后面的链表并且与前面的链表比较
    * */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //快慢指针找到链表的中点
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //翻转链表前半部分
        ListNode pre = null;
        ListNode next = null;
        while (head != slow) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        //如果是奇数个节点，去掉后半部分的第一个节点。

        if (fast != null) {
            slow = slow.next;
        }
        //回文校验
        while (pre != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
