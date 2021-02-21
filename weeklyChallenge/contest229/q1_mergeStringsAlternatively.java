class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        String sol = "";

        for (int i = 0; i < Math.min(len1, len2); i++) {
            sol += word1.charAt(i);
            sol += word2.charAt(i);
        }

        if (len1 == len2)
            return sol;
        else if (len1 > len2)
            sol += word1.substring(len2);
        else
            sol += word2.substring(len1);

        return sol;
    }
}