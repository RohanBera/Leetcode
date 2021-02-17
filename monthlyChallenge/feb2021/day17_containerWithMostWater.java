// 96.04% / 94.32%

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int area = (height[start] < height[end] ? height[start] : height[end]) * (end - start);

        while (start != end) {
            if (height[start] <= height[end])
                start++;
            else
                end--;

            int newAr = (height[start] < height[end] ? height[start] : height[end]) * (end - start);
            if (area < newAr)
                area = newAr;
        }

        return area;
    }
}