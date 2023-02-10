class Solution {
    public int myAtoi(String s) {
        int flag=1;
        int j=0;
        s=s.trim();
        long sum=0;
        if(s.length()==0){
            return 0;
        }
        else if(s.charAt(0)=='-'){
            flag=-1;
            j++;
        }
        else if(s.charAt(0)=='+'){
            j++;
            flag=1;
        }
        for(int i=j;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                sum=(sum*10)+(s.charAt(i)-'0');
            }
            else
            {break;}
        
         if(flag*sum<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(flag*sum>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }}
        return(int)(flag*sum);
    }
}