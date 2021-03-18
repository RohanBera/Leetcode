// 100% / 84.6% 

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) return 1;
        
        int t = 0;
        int sol = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (Integer.signum(nums[i] - nums[i-1]) != t && Integer.signum(nums[i] - nums[i-1]) != 0) {
                t = Integer.signum(nums[i] - nums[i-1]);
                sol++;
            }
        }
        
        return sol;
    }
}