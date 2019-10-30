package CyC;

import java.util.Arrays;
import java.util.Comparator;

public class L435_EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
       if (intervals.length==0)
           return 0;
       Arrays.sort(intervals, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               return o1[1] - o2[1];
           }
       });
       int count  = 1;
       int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]<end)
                continue;
            count++;
            end = intervals[i][1];
        }
        return intervals.length - count;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int result = new L435_EraseOverlapIntervals().eraseOverlapIntervals(intervals);
        System.out.println(result);
    }
}
