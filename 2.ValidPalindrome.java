class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string (lowercase + remove spaces/punctuation)
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        String rev = "";
        
        // Step 2: Reverse the cleaned string (notice the i >= 0)
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        
        // Step 3: Compare
        return s.equals(rev);
    }      
}