// 99.5% / 92.6% 

class Solution {
    private boolean findWordInString(String w, String s) {
        int ind = -1;
        for (int i = 0; i < w.length(); i++) {
            ind = s.indexOf(w.charAt(i), ind + 1);
            if (ind == -1)
                return false;
        }

        return true;
    }

    public String findLongestWord(String s, List<String> d) {
        String ans = "";
        for (String word : d) {
            int al = ans.length();
            int wl = word.length();

            if (al > wl || al == wl && word.compareTo(ans) > 0)
                continue;

            if (findWordInString(word, s))
                ans = word;
        }

        return ans;
    }
}