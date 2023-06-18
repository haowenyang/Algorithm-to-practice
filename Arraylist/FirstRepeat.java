package Arraylist;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeat {
    public static void main(String[] args) {
        int []array={3,2,1,2,2,3};
        repeat(array);
    }
    public static void repeat(int array[]){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<array.length;i++){
           if (map.containsValue(array[i])){
                System.out.println(array[i]);
                break;
            }else {
               map.put(i,array[i]);
           }
        }
    }
}
