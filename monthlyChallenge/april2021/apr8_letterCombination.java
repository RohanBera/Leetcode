class Solution {
    public String[] lnmap = new String[] { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxzy" };

    public List<String> letterCombinations(String digits) {
        List<String> sol = new ArrayList<String>();
        char[] d = digits.toCharArray();

        if (d.length == 0)
            return sol;

        else if (d.length == 1) {
            for (char ch : lnmap[d[0] - '2'].toCharArray()) {
                sol.add(String.valueOf(ch));
            }
        }

        else if (d.length == 2) {
            for (char c1 : lnmap[d[0] - '2'].toCharArray()) {
                for (char c2 : lnmap[d[1] - '2'].toCharArray()) {
                    sol.add(String.valueOf(c1) + String.valueOf(c2));
                }
            }
        }

        else if (d.length == 3) {
            for (char c1 : lnmap[d[0] - '2'].toCharArray()) {
                for (char c2 : lnmap[d[1] - '2'].toCharArray()) {
                    for (char c3 : lnmap[d[2] - '2'].toCharArray()) {
                        sol.add(String.valueOf(c1) + String.valueOf(c2) + String.valueOf(c3));
                    }
                }
            }
        }

        else {
            for (char c1 : lnmap[d[0] - '2'].toCharArray()) {
                for (char c2 : lnmap[d[1] - '2'].toCharArray()) {
                    for (char c3 : lnmap[d[2] - '2'].toCharArray()) {
                        for (char c4 : lnmap[d[3] - '2'].toCharArray()) {
                            sol.add(String.valueOf(c1) + String.valueOf(c2) + String.valueOf(c3) + String.valueOf(c4));
                        }
                    }
                }
            }
        }

        return sol;
    }
}