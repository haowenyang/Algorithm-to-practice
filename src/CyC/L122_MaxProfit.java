package CyC;

public class L122_MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length==0)
            return 0;
        int result = 0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]-prices[i-1]>0)
                result+=prices[i]-prices[i-1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int result = new L122_MaxProfit().maxProfit(prices);
        System.out.println(result);
    }
}
