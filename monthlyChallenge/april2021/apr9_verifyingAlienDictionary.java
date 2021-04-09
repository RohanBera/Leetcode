class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Character> a = new HashMap<Character, Character>();

        for (int i = 0; i < 26; i++)
            a.put(order.charAt(i), (char) ('a' + i));

        char[] temp = words[0].toCharArray();
        for (int j = 0; j < temp.length; j++) {
            temp[j] = a.get(temp[j]);
        }
        words[0] = String.valueOf(temp);

        for (int i = 1; i < words.length; i++) {
            temp = words[i].toCharArray();
            for (int j = 0; j < temp.length; j++) {
                temp[j] = a.get(temp[j]);
            }

            words[i] = String.valueOf(temp);

            if (words[i - 1].compareTo(words[i]) > 0)
                return false;
        }

        return true;

    }
}