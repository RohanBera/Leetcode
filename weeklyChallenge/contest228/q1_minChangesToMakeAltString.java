class Solution {
    public char charNot(char c) {
        if (c == '0')
            return '1';
        else
            return '0';
    }

    public String altArr(int len) {
        String altArr = "0";
        char temp = '1';

        for (int i = 1; i < len; i++) {
            altArr += temp;
            temp = charNot(temp);
        }

        return altArr;
    }

    public int minOperations(String s) {
        int len = s.length();
        String altArr = altArr(len);

        int count = 0;

        for (int i = 0; i < len; i++) {
            if ((s.charAt(i) ^ altArr.charAt(i)) == 1)
                count++;
        }

        return Math.min(count, len - count);
    }
}