// mem ; 95.85%

class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 1)
            return;

        for (int i = 0; i < matrix.length >> 1; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = temp;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return;

    }
}