package String;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        int array[]={2,3,1,4,5};
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i <array.length ; i++) {
            queue.add(array[i]);
        }
        while (queue.size()!=0){
        System.out.println(queue.poll());
        }
    }
}
