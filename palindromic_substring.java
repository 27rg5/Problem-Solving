class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int strLength = s.length();
        if (strLength < 2) {
            return strLength;
        }


        for (int i = 0; i < s.length(); i++) {
            //Odd length
            int left = i, right = i;
            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                count = count + 1;
                left -= 1;
                right += 1;
            }
            
            // even length
            left = i;
            right = i + 1;
            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                count = count + 1;
                left -= 1;
                right += 1;
            }
        }

        return count;
    }
}