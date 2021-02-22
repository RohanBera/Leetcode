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
            x = x << 1; // multiplying 2 in bitops
            count++;
        }

        sol = count;
        int diff = x - y;

        while (diff > 1) {
            sol += diff >> count; // divided by 2^n in bitops
            diff = diff & ((1 << count) - 1); // mod 2^n in bitops
            count--;
        }

        sol += diff;

        return sol;
    }
}