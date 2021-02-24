// 98% / 60%

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            // closing bracket ascii be 1+ or 2+ opening bracket ascii
            else if (!st.empty() && ((ch - 1) == st.peek() || (ch - 2) == st.peek()))
                st.pop();
            else
                return false;
        }

        if (st.empty())
            return true;
        else
            return false;
    }
}