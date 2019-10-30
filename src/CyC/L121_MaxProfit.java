package CyC;

import java.util.Map;

public class L121_MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length==0)
            return 0;
        int start = prices[0];
        int max = 0;
        for (int i = 1; i <prices.length ; i++) {
            if (start>prices[i])
                start = prices[i];
            else
                max = Math.max(max,prices[i]-start);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = new L121_MaxProfit().maxProfit(prices);
        System.out.println(result);
    }
}
