// 84.58% / 60.13%

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> check = new Stack<Integer>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(')
                check.push((i << 1) + 0);
            else if (s.charAt(i) == ')') {
                if (check.empty() || (check.peek() & 1) == 1)
                    check.push((i << 1) + 1);
                else
                    check.pop();
            }
        }

        if (check.empty())
            return s;

        StringBuilder sb = new StringBuilder(s);
        while (!check.empty())
            sb.deleteCharAt(check.pop() >> 1);

        return sb.toString();
    }
}