package CyC;


import java.util.Arrays;

public class L354_MaxEnvelopes {
    public static void main(String[] args) {
        int[][] envelopes =new int[][]{{5,4},{6,4},{6,7},{2,3}};
        System.out.println(maxEnvelopes(envelopes));

    }
    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length==0)
            return 0;
        int[]dp=new int[envelopes.length];
        Arrays.fill(dp,1);
        int max = 1;
        Arrays.sort(envelopes,(int[]a,int[]b)->(a[0]-b[0]));
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[j][0]<envelopes[i][0]&&envelopes[j][1]<envelopes[i][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                max=Math.max(max,dp[i]);
            }
        }
        return max;
    }
}
