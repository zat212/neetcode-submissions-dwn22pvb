class Solution {
    public boolean isPalindrome(String s) {
         String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] cleanArray = clean.toCharArray();
        String reversed = "";
        for (int i = 0; i < cleanArray.length; i++) {
            reversed = cleanArray[i] + reversed;
        }
        if (clean.equalsIgnoreCase(reversed)) {
            return true;
        }
        return false;
    }
}
