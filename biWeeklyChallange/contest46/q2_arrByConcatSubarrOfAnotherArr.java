// 100% / 100%

class Solution {
    public int getSubArrayIndex(int[] haystack, int hLen, int[] needle, int nLen, int startIndex) {
        outer: for (int i = startIndex; i <= hLen - nLen; ++i) {
            for (int j = 0; j < nLen; ++j) {
                if (haystack[i + j] != needle[j]) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    public boolean canChoose(int[][] groups, int[] nums) {
        int numsLen = nums.length;
        int gropLen = groups.length;

        int oldIndex = getSubArrayIndex(nums, numsLen, groups[0], groups[0].length, 0);

        if (oldIndex == -1)
            return false;

        int newIndex = 0;

        for (int i = 1; i < gropLen; i++) {
            newIndex = getSubArrayIndex(nums, numsLen, groups[i], groups[i].length, oldIndex + groups[i - 1].length);

            if (newIndex == -1)
                return false;

            if ((oldIndex + groups[i - 1].length) > newIndex)
                return false;

            oldIndex = newIndex;
        }

        return true;

    }
}