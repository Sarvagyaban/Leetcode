class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        long sum1=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            sum1+=nums[i];
            sum-=nums[i];
            if(sum1>=sum)
                count++;
        }
        return count;
    }
}