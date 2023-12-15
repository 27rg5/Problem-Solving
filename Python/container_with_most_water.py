class Solution:
    def maxArea(self, height: List[int]) -> int:
        ans = 0
        l = 0
        r = len(height) - 1

        while l < r:
            temp = min(height[l], height[r]) * (r-l)
            if temp > ans:
                ans = temp

            if height[l] < height[r]:
                l = l+1
            else:
                r = r-1

        return ans