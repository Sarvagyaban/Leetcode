class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small = new int[26];
        int[] capital = new int[26];
        int count = 0;
        
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                small[c - 'a'] = 1;
            } else {
                capital[c - 'A'] = 1;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (small[i] == 1 && capital[i] == 1) {
                count++;
            }
        }
        
        return count;
    }
}