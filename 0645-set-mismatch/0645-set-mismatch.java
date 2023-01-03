class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int length=nums.length;
        Arrays.sort(nums);
        int duplicate=0;
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            
            {
                if(nums[i]==nums[j])
                {
                    duplicate=nums[i];
                }
            }
        }
        int ans=1;
        for(int m=0;m<length;m++){
            if(nums[m]==ans){
                ans++;
            }
        }
        return new int[] {duplicate,ans};
    }
}