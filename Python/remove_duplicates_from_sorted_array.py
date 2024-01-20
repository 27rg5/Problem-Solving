class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        prev = nums[0]
        l = 1
        for r in range(1, len(nums)):
            if nums[r] != prev:
                prev = nums[r]
                nums[l], nums[r] = nums[r], nums[l]
                l += 1


        return l


        