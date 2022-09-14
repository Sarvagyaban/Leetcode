class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
    int count=0;
        int n=nums.length;
        for(int j=0;j<n;j++)
        {
        int mul=1;
        for(int i=j;i<n;i++)
        {
        mul=mul*nums[i];
        if(mul<k)
        {
        count++;
        }
        else
        {
            break;
        }
        }
        }
        return count;
    }
}