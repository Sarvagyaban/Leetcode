class Solution {
    public boolean isSubsequence(String s, String t) 
    {
    int a=0;
    int b=0;
    int c=0;

        for(int i=0;i<s.length();i++)
        {
            for(int j=b;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    c++;
                    b=j+1;
                 break;
                }
            }
        }
        if(c==s.length())
        return true;
        return false;
    }
}