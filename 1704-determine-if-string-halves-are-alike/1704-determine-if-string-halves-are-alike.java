class Solution {
    public boolean halvesAreAlike(String s) 
    {
     int l=s.length();
    s=s.toLowerCase(); 
     int c=0, c1=0;
        for(int i=0;i<l/2;i++)
        {
         if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
             c++;   
        }
        for(int i=l/2;i<l;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            c1++;
        }
        return (c1==c)? true: false;
    }
}