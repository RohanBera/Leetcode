//fk all algo 

class Solution {
    public boolean isIdealPermutation(int[] A) {
        // int l = 0;
        // int g = 0;

        // for (int i = 0; i < A.length-1; i++) {
        // if (A[i] > A[i+1]) {
        // l++;
        // }
        // for (int j = i+1; j < A.length; j++ ) {
        // if (A[i] > A[j])
        // g++;
        // }

        // }

        // if (l == g)
        // return true;
        // else
        // return false;

        for (int i = 0; i < A.length; i++)
            if (i - A[i] > 1 || i - A[i] < -1)
                return false;
        return true;
    }
}