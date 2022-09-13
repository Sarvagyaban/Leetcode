class Solution {
    public int maxSubArray(int[] nums) {
    return sol(nums);
    }
    public int sol(int arr[])
    {
        int ans =Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            ans = Math.max(sum,ans);
            if(sum<0)
            {
                sum=0;
            }
            //sum+=arr[i];
        }
        return ans;
    }
    
}