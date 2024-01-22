class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l,r = 0, len(numbers)-1
        sum1 = 0
        while l < r:
            if target == numbers[l] + numbers[r]:
                return [l+1,r+1]

            elif numbers[l] + numbers[r] > target:
                r -= 1

            else:
                l += 1

    

