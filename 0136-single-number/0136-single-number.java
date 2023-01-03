class Solution {
    public int singleNumber(int[] nums) 
    {
    Arrays.sort(nums);
    int a=0;
    for(int i=0;i<nums.length-1;)
    {
    if(nums[i]==nums[i+1])
    {
       i+=2;
    }
    else
    {
        return nums[i];
    }
    }
    return nums[nums.length-1];
    }
}