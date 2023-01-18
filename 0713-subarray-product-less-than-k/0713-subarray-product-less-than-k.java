class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum=1;
        int count=0;
        int i=0;
        int j=0;
    for (i = 0; i < nums.length; i++) {
         sum=1;
    for (j = i; j < nums.length; j++)
    {
        sum*=nums[j];
        if(sum>=k)
        {
            break;
        }
        else    
        {
            count++;
        }
    }
}
        return count;
    }
}