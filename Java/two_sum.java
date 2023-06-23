class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        int remaining = 0;
        Map <Integer, Integer> dict = new HashMap <Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            remaining = target - nums[i];
            if (dict.containsKey(remaining) == true)
            {
                ans[0] = i;
                ans[1] = dict.get(remaining);
                break;
            }
            else
            {
                dict.put(nums[i], i);
            }
        }
        return ans;
    }
}
