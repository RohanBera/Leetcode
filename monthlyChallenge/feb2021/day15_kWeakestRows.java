// 99.8% / 80+%

class Solution {
    public int[] bubbleSort(int[] arr, int len, int k) {
        int[] sol = new int[k];

        for (int i = 0; i < k; i++) {
            int count = 1;
            for (int j = len - 1; j > i; j--) {
                if ((arr[j] >> 7) < (arr[j - 1] >> 7)) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    continue;
                }
                count++;
            }

            if (count == len)
                break;
        }

        for (int i = 0; i < k; i++) {
            sol[i] = arr[i] & (1 << 7) - 1;
        }

        return sol;
    }

    public int numberOfSoilders(int arr[], int len) {
        for (int i = 0; i < len; i++)
            if (arr[i] == 0)
                return i;
        return len;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int numRows = mat.length;
        int lenRows = mat[0].length;
        int[] arr = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int nos = numberOfSoilders(mat[i], lenRows);
            arr[i] = (i + (nos << 7));
        }

        return bubbleSort(arr, numRows, k);
    }
}