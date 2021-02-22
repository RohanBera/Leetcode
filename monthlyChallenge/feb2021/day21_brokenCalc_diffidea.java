// 100% / 50%

class Solution {
    public int brokenCalc(int x, int y) {
        if (y <= x)
            return x - y;

        int sol = 0;
        while (y > x) {
            if ((y & 1) == 1) // y % 2 == 1
                y++;
            else
                y = y >> 1; // y = y/2

            sol++;
        }

        return sol + (x - y);
    }
}