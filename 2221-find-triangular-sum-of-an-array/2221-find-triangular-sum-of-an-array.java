class Solution {
    public int triangularSum(int[] nums) {
       
       for(int j=nums.length;j>0;j--)
       {
        for(int i=0;i<j-1;i++)
       {
        nums[i]=(nums[i]+nums[i+1])%10;   
       }
       }
        
        return nums[0];
    }
}