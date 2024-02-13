class Solution {
    public int majorityElement(int[] nums) 
    {
     Arrays.sort(nums);
        if(nums.length==1)return nums[0];
      int ans=0;  
        if(nums.length%2==0)
        {
        ans=nums[(nums.length/2)-1];
        }
        else
        {
         ans= nums[(nums.length/2)];   
        }
        return ans;
    }
}