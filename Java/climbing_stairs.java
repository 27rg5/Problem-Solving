class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp, 0);
        int ans1 = 0;
        ans1 = find_ans(n, dp, ans1);
        return ans1;
    }
    public int find_ans(int n1, int [] dp1, int ans)
    {
        if (n1 == 1 || n1 == 2)
        {
            return n1;
        }
        if (dp1[n1] != 0)
        {
            return dp1[n1];
        }
        ans = find_ans(n1-1, dp1, ans) + find_ans(n1-2, dp1, ans);
        dp1[n1] = ans;
        return ans;
    }
}