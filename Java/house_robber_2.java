class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        return Math.max(
            robHelper(nums, 0, nums.length - 1),
            robHelper(nums, 1, nums.length)
        );
    }

    public int robHelper(int[] nums, int start, int end) {
  
    if (nums.length == 2) return Math.max(nums[0], nums[1]);

    int[] dp = new int[nums.length];
    Arrays.fill(dp, 0);
    dp[start] = nums[start];
    dp[start+1] = Math.max(nums[start], nums[start+1]);

    for (int i = start+2; i < end; i++) {
        dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    }
    if (start == 0) return dp[nums.length - 2];
    else return dp[nums.length - 1];

    }
}