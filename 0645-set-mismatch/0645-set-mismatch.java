class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
    int b=0;
    for (int i = 0; i < nums.length; i++)
    {
        for (int j = i+1; j < nums.length; j++)
        {
            if(nums[i]==nums[j])
            b=nums[i];
        }
    }
    Arrays.sort(nums);
    int ans=1;
    int i=0;
    for(i=0;i<=nums.length-1;i++)
    {
    if(nums[i]==ans)
    {ans++;}
    
    }
return new int[] {b,ans};  
}
}