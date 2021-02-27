// 100% / 81.5%

class Solution {
    int val;

    private int firstNonValFromLast(int[] nums, int s, int e) {
        for (int i = e - 1; i >= s; i--)
            if (nums[i] != val)
                return i;

        return 0;
    }

    public int removeElement(int[] nums, int val) {
        int end = nums.length;
        int freq = 0;
        this.val = val;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                freq++;
                end = firstNonValFromLast(nums, i, end);

                nums[i] = nums[end];
            }
        }

        return nums.length - freq;
    }
}