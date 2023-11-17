class Solution:
    def hammingWeight(self, n: int) -> int:
        i = 0
        ans = 0
        max1 = 32
        temp = 0
        while n > 0:
            for i in range(33):
                if n - pow(2, i) < 0:
                    ans += 1
                    break
            n = n - pow(2, i-1)

        return ans

        