class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack1 = new Stack <Character>();
        char temp = ' ';
        for (int i = 0; i < s.length(); i++)
        {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '['))
            {
                stack1.push(s.charAt(i));
                continue;
            }
            else
            {
                if (stack1.isEmpty() == true) return false;
                char ch = stack1.peek();
                if (ch == '[' && s.charAt(i) != ']') return false;
                else if (ch == '{' && s.charAt(i) != '}') return false;
                else if (ch == '(' && s.charAt(i) != ')') return false;
                stack1.pop();
            }
        }
        return stack1.isEmpty();
    }
}
