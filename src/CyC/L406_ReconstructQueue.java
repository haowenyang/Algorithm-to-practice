package CyC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L406_ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length==0){
            return new int[0][0];
        }
        Arrays.sort(people,(a,b)->(a[0]==b[0]?a[1] - b[1]:b[0]-a[0]));
        List<int[]> list = new ArrayList<>();
        for (int[] i:people) {
            list.add(i[1],i);
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] result = new L406_ReconstructQueue().reconstructQueue(people);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[i].length ; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
