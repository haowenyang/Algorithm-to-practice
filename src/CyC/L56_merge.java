package CyC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L56_merge {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length<=1)
            return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        int start  = 0;
        int end = intervals.length;
        while (start<end){
            int left = intervals[start][0];
            int right = intervals[start][1];
            while (start+1<end&&intervals[start+1][0]<=right){
                right = Math.max(intervals[start+1][1],right);
                start++;
            }
            list.add(new int[]{left,right});
            start++;
        }
        int[][] res = new int[list.size()][];
        for (int i = 0; i <list.size() ; i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
