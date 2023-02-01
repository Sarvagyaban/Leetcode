class Solution {
    public int countEven(int num) 
    {
        int count=0;
     for(int t=1;t<=num;t++)
     {
         int rem=0;
         int sum=0;
         int i=t;
         while(i>0)
         {
        rem=i%10;
        sum+=rem;
        i=i/10;
         }
         if(sum%2==0)
         count++;
     }   
     return count;
    }
}