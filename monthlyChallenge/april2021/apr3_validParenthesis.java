class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        char [] c = s.toCharArray();
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == '(') {
                st.push(i);
            }
            else {
                st.pop();
                
                if (st.isEmpty()) {
                    st.push(i);
                }
                else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }
        
        return max;
    }
}