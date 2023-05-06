class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        
        char arr1 [] = s.toCharArray();
        Arrays.sort(arr1);
        String str1 = new String(arr1);
        char arr2 [] = t.toCharArray();
        Arrays.sort(arr2);
        String str2 = new String(arr2);
        if (str1.equals(str2))
            return true;
        else
            return false;
    }
}