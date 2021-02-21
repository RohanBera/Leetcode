class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();

        ArrayList<Integer> index = new ArrayList<Integer>();
        int[] sol = new int[len];

        for (int i = 0; i < len; i++) {
            if (boxes.charAt(i) == '1') {
                index.add(i);
            }
        }

        for (int i = 0; i < len; i++) {
            for (Integer ind : index) {
                sol[i] += Math.abs(ind - i);
            }
        }

        return sol;
    }
}