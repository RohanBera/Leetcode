class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sol = 0;
        int i = 0;
        switch (ruleKey) {
            case "type":
                i = 0;
                break;
            case "color":
                i = 1;
                break;
            case "name":
                i = 2;
                break;
        }

        for (List item : items) {
            if (item.get(i).equals(ruleValue)) {
                sol++;
            }
        }

        return sol;
    }
}