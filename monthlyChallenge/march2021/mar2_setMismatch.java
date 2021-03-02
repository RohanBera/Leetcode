// 46% / 93.69%

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] sol = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int sum = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                sol[0] = nums[i];
            else
                sum += nums[i];
        }

        sol[1] = ((n * (n + 1)) >> 1) - sum;

        return sol;

    }
}