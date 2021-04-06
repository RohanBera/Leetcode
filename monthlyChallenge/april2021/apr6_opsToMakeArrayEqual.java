class Solution {
    public int minOperations(int n) {
        if (n % 2 == 0)
            return (n >> 1) * (n >> 1);
        else
            return (n >> 1) * ((n >> 1) + 1);
    }
}