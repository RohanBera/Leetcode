// 74.52% / 81.85%

class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (s.length() < (1 << k))
            return false;

        HashSet<String> h = new HashSet<String>();

        for (int i = 0; i <= s.length() - k; i++) {
            h.add(s.substring(i, i + k));
            if (h.size() == (1 << k))
                return true;
        }

        return false;
    }
}