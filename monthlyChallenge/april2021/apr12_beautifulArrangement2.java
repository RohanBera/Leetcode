// 50% / 90%

class Solution {
    public int[] constructArray(int n, int k) {
        int[] sol = new int[n];
        sol[0] = 1;
        int t = k;

        for (int i = 1; i < n; i++) {
            if (i <= t) {
                sol[i] = sol[i - 1] + k;
                k = k > 0 ? -k + 1 : -k - 1;
            } else {
                sol[i] = i + 1;
            }
        }

        return sol;
    }
}