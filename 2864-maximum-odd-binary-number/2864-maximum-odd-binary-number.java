class Solution {
    public String maximumOddBinaryNumber(String s) 
    {
     int zero=0;
        int one=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                zero++;
            }
            else
            {
                one++;
            }
        }
StringBuilder res = new StringBuilder();
        res.append("1".repeat(one - 1));
        res.append("0".repeat(zero));
        res.append("1");
        return res.toString();        
    }
}