// 61% / 35% 

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> sol = new ArrayList<String>();
        sol.add(S);
        int len = S.length();

        for (int i = 0; i < len; i++) {
            int letter = S.charAt(i);
            if (!(letter - '0' >= 0 && letter - '0' <= 9)) {
                int solLen = sol.size();
                for (int j = 0; j < solLen; j++) {
                    StringBuilder sb = new StringBuilder(sol.get(j));
                    if (letter >= 97 && letter <= 122)
                        sb.setCharAt(i, (char) (letter - 32));
                    else
                        sb.setCharAt(i, (char) (letter + 32));
                    sol.add(sb.toString());
                }
            }
        }

        return sol;
    }
}