// 64.20 / 97.37

class Solution {
    static int closestMultiple(int n, int x) {
        if (x > n)
            return (x - n) >= (n) ? 0 : 1;

        int a = (n / x) * x;
        int b = a + x;
        return (n - a > b - n) ? b / x : a / x;
    }

    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);

        int sum = 0;
        for (int i : arr)
            sum += i;
        if (sum <= target)
            return arr[arr.length - 1];

        int t = closestMultiple(target, arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= t)
                return t;

            target -= arr[i];
            t = closestMultiple(target, arr.length - i - 1);
        }

        return Math.min(arr[arr.length - 1], t);
    }
}