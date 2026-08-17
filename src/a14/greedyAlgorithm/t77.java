package a14.greedyAlgorithm;

public class t77 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int ans = 0;
        for (int price : prices) {
            ans = Math.max(ans,price - minPrice);
            minPrice = Math.min(minPrice,price);
        }
        return ans;
    }
}
