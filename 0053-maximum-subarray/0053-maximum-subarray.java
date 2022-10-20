class Solution {
    public int maxSubArray(int[] nums) 
    {
    int ans=Integer.MIN_VALUE;
        int prev=0;
    for(int i=0;i<nums.length;i++)
    {
        prev +=nums[i];
        ans=Math.max(ans,prev);
        if(prev<0)
        {
            prev=0;
        }
    }
        return ans;
    }
}