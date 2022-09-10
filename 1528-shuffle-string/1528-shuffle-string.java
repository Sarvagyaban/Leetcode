class Solution {
    public String restoreString(String s, int[] indices) 
    {
    char ch[]=new char[s.length()];
        for(int i=0;i< s.length();i++)
        {
         for(int j=0;j<s.length();j++)
         {
             if(i==indices[j])
            ch[i]=s.charAt(j);
        }
        }
        return new String(ch);
    }
}