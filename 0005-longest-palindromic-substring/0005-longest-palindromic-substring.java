class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        
        String LPS = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes (single center character)
            int low = i;
            int high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length())
                LPS = palindrome;
            
            // Even length palindromes (center between two characters)
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
          
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length())
                LPS = palindrome;
        }
        
        return LPS;
    }
}
