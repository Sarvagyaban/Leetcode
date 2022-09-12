class Solution {
    public int search(int[] nums, int target) 
    {
    int n=nums.length;
    int lo=0;
    int hi=n-1;
   // int ans=-1;
    while(lo<=hi)
    {
        int mid=(hi+lo)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(target<nums[mid])
        {
            hi=mid-1;
        }
        else
        {
            lo=mid+1;
        }
    }
            return -1;
    }
}