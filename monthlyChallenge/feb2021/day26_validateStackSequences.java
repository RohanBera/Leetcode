// 95.06%  / 95.53%

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        if (len <= 2)
            return true;

        Stack<Integer> s = new Stack<Integer>();
        int ind = 0;

        for (int i = 0; i < len; i++) {
            if (!s.empty() && s.peek() == popped[i])
                s.pop();
            else {
                while (ind < len && pushed[ind] != popped[i]) {
                    s.push(pushed[ind]);
                    ind++;
                }
                if (ind == len)
                    return false;
                ind++;
            }
        }

        return true;
    }
}