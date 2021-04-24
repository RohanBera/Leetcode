// Used an int as a stack

// attempt 2 100% / 72%
// made into single iteration

class Solution {
    public int countBinarySubstrings(String str) {
        int s1 = 0, f1 = 0, s2 = 0, f2 = 0, sol = 0;

        for (char c : str.toCharArray()) {
            if (c == '0') {
                if (f1 == 1) {
                    s1 = 0;
                    f1 = 0;
                }
                s1++;

                f2 = 1;
                if (s2 > 0) {
                    s2--;
                    sol++;
                }
            } else {
                f1 = 1;
                if (s1 > 0) {
                    s1--;
                    sol++;
                }

                if (f2 == 1) {
                    s2 = 0;
                    f2 = 0;
                }
                s2++;
            }
        }

        return sol;
    }
}

// 86.32% / 86.71%

class Solution {
    public int countBinarySubstrings(String str) {
        // Stack<Integer> s = new Stack<Integer>();

        int s = 0;
        int sol = 0;
        int f = 0;

        for (char c : str.toCharArray()) {
            if (c == '0') {
                if (f == 1) {
                    // s.clear();
                    s = 0;
                    f = 0;
                }
                // s.push(0);
                s++;
            } else {
                f = 1;
                // if (!s.isEmpty() && s.peek() == 0) {
                if (s > 0) {
                    // s.pop();
                    s--;
                    sol++;
                }
            }
        }

        // s.clear();
        s = 0;
        f = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                if (f == 1) {
                    // s.clear();
                    s = 0;
                    f = 0;
                }
                // s.push(1);
                s++;
            } else {
                f = 1;
                // if (!s.isEmpty() && s.peek() == 1) {
                if (s > 0) {
                    // s.pop();
                    s--;
                    sol++;
                }
            }
        }

        return sol;
    }
}