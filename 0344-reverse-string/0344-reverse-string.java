class Solution {
    public void reverseString(char[] s) 
    {
    int m=s.length-1;
        for(int i=0;i<s.length/2;i++)
        {
        char temp=s[i];
        s[i]=s[m];
        s[m]=temp;
        m--;
        }
    }
}