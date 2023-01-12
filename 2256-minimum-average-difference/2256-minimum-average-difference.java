class Solution {
    public int minimumAverageDifference(int[] nums) 
    {
        long sum=0;
        long sum1=0;
        int count=0;
        long avg=0;
        int it=0;
        long ans=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
            sum-=nums[i];
            if(nums.length-i-1==0){
                it=1;
            }
            else{ 
                it=(nums.length-i-1);
            }
            avg=(sum1/(i+1))-(sum/it);
            if(avg<0)
            {avg*=-1;}
            if(avg<ans){
            ans=Math.min(ans,avg);
            count =i;
        }}
        return count;
    }
}