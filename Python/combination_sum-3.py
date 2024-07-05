class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        res = []
        temp = []

        def dfs(i, n, k):
            if n == 0 and k == 0:
                res.append(temp[:])
                return
            if n < 0 or k == 0:
                return
        

            for i in range(i, 10):
                temp.append(i)
                dfs(i+1, n-i, k-1)
                temp.pop()

        dfs(1, n, k)

        return res
