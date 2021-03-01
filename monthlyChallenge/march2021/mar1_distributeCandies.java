// forgot, but it was less, like 50% - 50%

class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for (int candy : candyType)
            s.add(candy);

        return Math.min(s.size(), candyType.length >> 1);
    }
}