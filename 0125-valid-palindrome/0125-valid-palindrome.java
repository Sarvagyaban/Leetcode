class Solution {
    public boolean isPalindrome(String s) 
    {
    String str="";
    s=s.toLowerCase();
    s =  s.replaceAll("[^a-z0-9]", "");
    for (int i=0; i<s.length(); i++)
      {
        str= s.charAt(i) +str;
      }
        return str.equals(s);
    }
}