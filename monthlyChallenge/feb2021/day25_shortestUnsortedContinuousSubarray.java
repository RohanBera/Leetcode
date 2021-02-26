// 99.95% / 88.38% 

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
            else if (max > nums[i])
                end = i;
        }

        if (end == -1)
            return 0;

        int start = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (max > nums[i])
                max = nums[i];
            else if (max < nums[i])
                start = i;
        }

        return end - start + 1;
    }
}