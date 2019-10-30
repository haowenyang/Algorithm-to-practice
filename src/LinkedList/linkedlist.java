package LinkedList;

import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        System.out.println(list.getFirst());
        list.add(2,2);
        Node node=new Node(3);
        for (int i:list){
            if (i==node.val){
                System.out.println("得到了");
            }
        }
        System.out.println(list);
    }
    public static int length(LinkedList linkedList) {
        return  linkedList.size();
    }

}
