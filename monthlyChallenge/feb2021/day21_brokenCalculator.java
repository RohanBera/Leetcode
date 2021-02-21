// 100% / 30%
// will i even remember how i did this?
// algo amamamze :o 
// credits bharadwaj

class Solution {
    public int brokenCalc(int x, int y) {
        if (y <= x)
            return x - y;

        int count = 0;
        int sol = 0;

        while (x < y) {
            x = x << 1;
            count++;
        }

        sol = count;
        int diff = x - y;

        while (diff > 1) {
            sol += diff >> count;
            diff = diff % (1 << count);
            count--;
        }

        sol += diff;

        return sol;
    }
}