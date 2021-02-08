class Solution {
    public int[] shortestToChar(String s, char c) {
        int slen = s.length();
        
        int ans[] = new int[slen];
        Arrays.fill(ans, slen);
        
        for (int i = s.indexOf(c), oldi = 0; i >= 0; oldi = i, i = s.indexOf(c, i+1)) {
            for (int j = oldi; j < slen; j++) {
                ans[j] = Math.min(Math.abs(i-j), ans[j]);
            }
        }
        
        return ans;
    }
}