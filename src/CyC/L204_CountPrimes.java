package CyC;

import java.util.Arrays;

public class L204_CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        boolean[] visit =new boolean[n+1];
        Arrays.fill(visit,true);
        int count = 0;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (visit[i]){
                for (int j = i*i; j <n ; j+=i) {
                    visit[j]=false;
                }
            }
        }
        for (int i = 2; i <visit.length-1 ; i++) {
            if (visit[i]){
                count++;
            }
        }
        return count;
    }
}
