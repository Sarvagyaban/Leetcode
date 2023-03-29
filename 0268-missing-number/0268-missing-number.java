class Solution {
    public int missingNumber(int[] nums) 
    {
    Arrays.sort(nums);
    int ans=0;
    for(int i=0;i<=nums.length-1;i++)
    {
if(nums[i]==ans)
ans++;
    }
return ans;
    }
}