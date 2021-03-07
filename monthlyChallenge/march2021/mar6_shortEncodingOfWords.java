// 19.20% / 93.38 

class Solution {
    public int minimumLengthEncoding(String[] words) {
        String sol = "";
        Arrays.sort(words, (a, b) -> b.length() - a.length());

        for (String w : words) {
            w = w + "#";
            if (sol.indexOf(w) == -1) {
                sol += w;
            }
        }

        return sol.length();
    }
}