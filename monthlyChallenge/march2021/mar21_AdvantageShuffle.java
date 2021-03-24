// 99.8% / 61.43

class Pair {
    int index;
    int value;

    public Pair(int i, int v) {
        index = i;
        value = v;
    }
}

class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int l = 0;
        int r = A.length - 1;

        Arrays.sort(A);

        Pair[] t = new Pair[r + 1];

        for (int i = 0; i <= r; i++)
            t[i] = new Pair(i, B[i]);

        Arrays.sort(t, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.value - p2.value;
            }
        });

        for (int i = r; i >= 0; i--) {
            if (t[i].value < A[r]) {
                t[i].value = A[r];
                r--;
            } else {
                t[i].value = A[l];
                l++;
            }
        }

        for (int i = 0; i < A.length; i++)
            A[t[i].index] = t[i].value;

        return A;
    }
}