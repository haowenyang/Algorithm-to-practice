package CyC;

import java.util.Arrays;
import java.util.Comparator;

public class L452_FindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int end = points[0][1];
        int count = 1;
        for (int i = 1; i <points.length ; i++) {
            if (points[i][0]<=end){
                continue;
            }
            count++;
            end = points[i][1];
        }
        return points.length-count;
    }
    public static void main(String[] args) {
        int[][] points = {{10,16}, {2,8}, {1,6}, {7,12}};
        int result = new L452_FindMinArrowShots().findMinArrowShots(points);
        System.out.println(result);
    }
}
