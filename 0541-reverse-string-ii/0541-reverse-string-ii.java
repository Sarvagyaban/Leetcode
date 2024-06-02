class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < s.length() - 1; i += (k * 2)) 
        {
            int l = i, r = Math.min(i + k - 1, s.length() - 1);
            while(l < r) {
                char tmp = ch[l];
                ch[l++] = ch[r];
                ch[r--] = tmp;
            }
        }
        return new String(ch);
    }
}