// 100% / 50%

class Solution {
    private void helper(List sol, char[] str, int index, int len) {
        if (index == len) {
            sol.add(String.valueOf(str));
            return;
        }

        if (Character.isLetter(str[index])) {
            str[index] = Character.toLowerCase(str[index]);
            helper(sol, str, index + 1, len);

            str[index] = Character.toUpperCase(str[index]);
            helper(sol, str, index + 1, len);
        } else {
            helper(sol, str, index + 1, len);
        }

    }

    public List<String> letterCasePermutation(String S) {
        List<String> sol = new ArrayList<String>();
        int len = S.length();
        char[] s = S.toCharArray();

        helper(sol, s, 0, len);

        return sol;
    }

}