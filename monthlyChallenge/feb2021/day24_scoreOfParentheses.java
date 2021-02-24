// 100% / 96.20%

class Solution {
    public int scoreOfParentheses(String s) {
        int d = 0, sol = 0;
        int f = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                d++;
                f = 1;
            } else if (ch == ')') {
                d--;
                if (f == 1) {
                    f = 0;
                    sol += (1 << d);
                }
            }
        }
        return sol;
    }
}