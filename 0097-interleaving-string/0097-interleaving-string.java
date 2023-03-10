class Solution {
     public boolean isInterleave(String s1, String s2, String s3)
    {
        if((s1.length() + s2.length()) != s3.length()) return false;
        boolean[] a = new boolean[s1.length() + 1];
        a[0] = true;
        
        for(int i = 1; i < a.length; i++){
            a[i] = a[i-1] && (s1.charAt(i-1) == s3.charAt(i-1));
        }
        
        for(int i = 1; i <= s2.length() ; i++)
        {
            a[0] = a[0] && (s2.charAt(i-1) == s3.charAt(i-1));
            for(int j = 1; j < a.length; j++)
            {
                a[j] = (a[j] && s2.charAt(i-1) == s3.charAt(i + j - 1))
                    || (a[j-1] && s1.charAt(j-1) == s3.charAt(i + j- 1));
            }  
        }
        
        return a[s1.length()];
    }
}