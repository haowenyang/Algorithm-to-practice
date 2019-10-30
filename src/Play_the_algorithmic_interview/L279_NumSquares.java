package Play_the_algorithmic_interview;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class L279_NumSquares {
    public static void main(String[] args) {
        int n = 12;
        int result =new L279_NumSquares().numSquares(n);
        System.out.println(result);
    }
    public int numSquares(int n) {
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        boolean[] booleans = new boolean[n+1];
        queue.add(new Pair<>(n,0));
        booleans[n]=true;
        int res=0;
        while (!queue.isEmpty()){
            Pair<Integer,Integer> pair = queue.poll();
            int x = pair.getKey();
            int y = pair.getValue();
            for (int i = 1; ; i++) {
                    int a = x-i*i;
                    if (a<0)
                        break;
                    if (a==0){
                        res=y+1;
                        return res;
                    }
                    if (!booleans[a]){
                    queue.add(new Pair<>(a,y+1));
                    booleans[a]=true;
                }
            }
        }
        return res;
    }
}
