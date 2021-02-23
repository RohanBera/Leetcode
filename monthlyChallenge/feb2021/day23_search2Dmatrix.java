// 0% / 99.07% (yea, idk how either)

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if (mat[0][0] == target)
            return true;

        Stack<Integer> s = new Stack<Integer>();
        int m = mat.length - 1;
        int n = mat[0].length - 1;
        int min = mat[0][0] - 1;

        s.push(0);

        while (!s.empty()) {
            int curr = s.pop(), i = curr & (1 << 9) - 1, j = curr >> 9;
            if (mat[i][j] == target)
                return true;

            mat[i][j] = min;

            int a = Math.min(i + 1, m);
            if (mat[a][j] != min && mat[a][j] <= target)
                s.push(a + (j << 9));

            int b = Math.min(n, j + 1);
            if (mat[i][b] != min && mat[i][b] <= target)
                s.push(i + (b << 9));
        }

        return false;
    }
}