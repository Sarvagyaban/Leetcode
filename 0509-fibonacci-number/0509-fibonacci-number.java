class Solution {
    public int fib(int n) 
    {
      if(n==0)return 0;
      if(n==1||n==2)return 1;
        int total=0;
        int a=1;
        int b=1;
        for(int i= 2;i<n;i++)
        {
            total=a+b;
            a=b;
            b=total;
        }
        return total;
    }  
    }
