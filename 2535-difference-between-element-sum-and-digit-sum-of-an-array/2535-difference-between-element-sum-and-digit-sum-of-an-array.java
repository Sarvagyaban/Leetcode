class Solution {
    public int differenceOfSum(int[] nums) 
    {
     int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        
        int digit=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                digit=nums[i]%10;
                sum1+=digit;
                nums[i]/=10;
            }
        }
        int ans=sum-sum1;
        if(ans<1)return ans*-1;
        else return ans;
    }
}