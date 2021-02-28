// 9.66% / 86% 

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;
        if (divisor == 1)
            return dividend;
        if (divisor == -1) {
            if (dividend == (1 << 31)) {
                return ~(1 << 31);
            }
            return -dividend;
        }

        long dnd = dividend;
        long dsr = divisor;

        if (dividend < 0)
            dnd = -(long) dividend;

        if (divisor < 0)
            dsr = -(long) divisor;

        if (dnd < dsr)
            return 0;

        int sol = 0;
        while (dnd >= dsr) {
            dnd -= dsr;
            sol++;
        }

        return (dividend < 0) ^ (divisor < 0) ? -sol : sol;
    }
}