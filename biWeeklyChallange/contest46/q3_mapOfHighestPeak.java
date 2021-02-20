// 100% / 100%

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length - 1;
        int n = isWater[0].length - 1;

        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> z = new ArrayList<Integer>();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (isWater[i][j] == 1) {
                    q.add(i + (j << 10));
                    z.add(i + (j << 10));
                    isWater[i][j] = 0;
                } else
                    isWater[i][j] = -1;
            }
        }

        while (q.size() > 0) {
            int curr = q.remove(), i = curr & (1 << 10) - 1, j = curr >> 10;

            if (isWater[Math.max(i - 1, 0)][j] == -1) {
                isWater[Math.max(i - 1, 0)][j] = isWater[i][j] + 1;
                q.add(Math.max(i - 1, 0) + (j << 10));
            }

            if (isWater[Math.min(i + 1, m)][j] == -1) {
                isWater[Math.min(i + 1, m)][j] = isWater[i][j] + 1;
                q.add(Math.min(i + 1, m) + (j << 10));
            }
            if (isWater[i][Math.max(j - 1, 0)] == -1) {
                isWater[i][Math.max(j - 1, 0)] = isWater[i][j] + 1;
                q.add(i + (Math.max(j - 1, 0) << 10));
            }
            if (isWater[i][Math.min(j + 1, n)] == -1) {
                isWater[i][Math.min(j + 1, n)] = isWater[i][j] + 1;
                q.add(i + (Math.min(j + 1, n) << 10));
            }
        }

        return isWater;
    }
}