// 100% / 93% 

class Solution {

    public static int middle(int a, int b, int c) {
        if (a > b) {
            if (b > c)
                return b;
            else if (a > c)
                return c;
            else
                return a;
        } else {
            if (a > c)
                return a;
            else if (b > c)
                return c;
            else
                return b;
        }
    }

    public int maximumScore(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int mid = middle(a, b, c);
        int min = Math.min(a, Math.min(b, c));
        int sol = 0;

        if (min + mid > max) {
            sol += ((min + mid - max) >> 1) + ((min + mid - max) % 2);

            min -= sol;
            mid -= sol;
        }

        sol += (min + mid);

        return sol;
    }
}