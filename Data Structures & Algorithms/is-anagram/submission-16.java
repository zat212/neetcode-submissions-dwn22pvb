class Solution {
    public boolean isAnagram(String s, String t) {

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray1);
        if (charArray1.length != charArray.length) {
            return false;
        }
        String res = Arrays.toString(charArray);
        String res1 = Arrays.toString(charArray1);
        if (res.equalsIgnoreCase(res1)) {
            return true;
        }

        return false;

    }
}
