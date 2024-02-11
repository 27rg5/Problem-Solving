class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        l = 0
        r = k
        matches = 0
        res = 0
        a = {"a", "e", "i", "o", "u"}
        for i in range(k):
            if s[i] in a:
                matches += 1

        res = matches
        for r in range(k, len(s)):
            if s[r] in a:
                matches += 1
            if s[l] in a:
                matches -= 1

            l +=1

            res = max(res, matches)


        return res
        

