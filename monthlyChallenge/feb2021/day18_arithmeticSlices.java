// 100% / 91.03% 

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        if (n <= 2) {
            return 0;
        }

        int count = 0;
        int d = A[1] - A[0];
        int sol = 0;

        for (int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] == d) {
                count++;
            } else {
                d = A[i] - A[i - 1];
                sol += ((count * (count + 1)) / 2);
                count = 0;
            }
        }

        return sol + ((count * (count + 1)) / 2);
    }
}