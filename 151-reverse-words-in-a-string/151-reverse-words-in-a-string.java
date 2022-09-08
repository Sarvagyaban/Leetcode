class Solution {
    public String reverseWords(String s) 
    {
    int n=s.length();
    s=s.trim();
    String ans="";
    String[] arr=s.split("\s+");
    for(int i=arr.length-1;i>=0;i--)
    {
    ans+=arr[i] +" ";
    }
        return ans.trim();
    }
}