package CyC;

import java.util.*;

public class L347_TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if (nums.length<k){
            return list;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] result = new ArrayList[nums.length+1];
        for (int key : map.keySet()) {
            int i = map.get(key);
            if (result[i]==null){
                result[i] = new ArrayList<>();
            }
            result[i].add(key);
        }
        for (int i = result.length-1; i >=0 ; i--) {
            if (result[i]==null)
                continue;
            if (result[i].size()<=(k-list.size())){
                list.addAll(result[i]);
            }else {
                list.addAll(result[i].subList(0,k-list.size()));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        list = new L347_TopKFrequent().topKFrequent(array,k);
        for (int i:list) {
            System.out.println(i);
        }
    }
}
