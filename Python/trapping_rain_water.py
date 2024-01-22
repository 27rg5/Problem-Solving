class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0

        l, r = 0, len(height) - 1
        leftMax, rightMax = height[l], height[r]
        res = 0
        while l < r:
            if leftMax < rightMax:
                l += 1
                if leftMax - height[l] > 0:
                    res += leftMax - height[l]
                leftMax = max(leftMax, height[l])
            else:
                r -= 1
                if rightMax - height[r] > 0:
                    res += rightMax - height[r]
                rightMax = max(rightMax, height[r])
        return res
