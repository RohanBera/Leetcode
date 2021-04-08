class Solution {
    char [] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    
    public boolean isVowel(char c) {
        for (char vowel : vowels) 
            if (c == vowel)
                return true;
        
        return false;
    }
    
    public boolean halvesAreAlike(String s) {
        int fh = 0, sh = 0;
        
        for (int i = 0; i < (s.length() >> 1); i++)
            if (isVowel(s.charAt(i)))
                fh++;
        
        for (int i = s.length() >> 1; i < s.length(); i++)
            if (isVowel(s.charAt(i)))
                sh++;
        
    if (fh == sh)
            return true;
        else 
            return false;
    } 
}