class Solution {
    public boolean areNumbersAscending(String s) 
    {
        int temp=0;
        int max=0;
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                f=1;
                temp=(temp*10)+(s.charAt(i)-'0');
            }
            else
            {
                if(f==1){
                    f=0;
                    if(temp<=max)
                    {
                        return false;
                    }
                    else
                    {
                        max=temp;
                        temp=0;
                    }
                }
            }
        }
        if(f==1)
        {
            if(temp<=max)
            {
                return false;
            }
        }
        return true;
    }
}