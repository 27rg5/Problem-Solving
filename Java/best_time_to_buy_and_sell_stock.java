class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, ans = 0;
        while (j < prices.length)
        {
            if (prices[j] - prices[i] < 0)
            {
                i = j;
                j = j + 1;
            }
            else
            {
                ans = Math.max(prices[j]-prices[i], ans);
                j = j + 1;
            }
        }
        return ans;
    }
}