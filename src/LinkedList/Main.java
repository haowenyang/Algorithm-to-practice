package LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next=n4;
        n4.next=n5;
        print(n1);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        for(int i : list){
            System.out.print(i+" ");
        }

    }
    public static void add(){

    }

    public static void print(Node head){
        Node p = head;
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }

} class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
