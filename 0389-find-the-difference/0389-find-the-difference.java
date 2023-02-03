class Solution {
    public char findTheDifference(String s, String t) 
    {
     int a=0;
     int sum1=0;
     for(int i=0;i<s.length();i++)
     {
         a=s.charAt(i);
         sum1+=a;
     }   
     a=0;
     int sum2=0;
     for(int i=0;i<t.length();i++)
     {
         a=t.charAt(i);
         sum2+=a;
     }
     return (char) (sum2-sum1);
    }
}