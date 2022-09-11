class Solution {
    public boolean isPalindrome(int x) 
    {
    int a=x;
        int sum=0;
        while(x>0)
        {
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(sum==a)
        return true;
        else
            return false;
    }
}