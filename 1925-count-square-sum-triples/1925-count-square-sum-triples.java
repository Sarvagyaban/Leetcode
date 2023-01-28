class Solution {
    public int countTriples(int n) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
nums[i]=i+1;
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
     {
         for(int j=0;j<nums.length;j++)
         {
             for(int k=0;k<nums.length;k++)
             {
                 if(((nums[i]*nums[i])+(nums[j]*nums[j])) == (nums[k]*nums[k]))
                     count++;
             }
         }
     }
        return count;
    }
}