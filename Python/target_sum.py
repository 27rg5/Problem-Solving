class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        
        len1 = len(nums)
        @cache
        def dfs(i, ans):
            if (i >= len1):
                return 0 if ans != target else 1

            # print(i)
            final = dfs(i+1, ans-nums[i]) + dfs(i+1, ans + nums[i])
            return final
        
        return dfs(0, 0)

        #1,0