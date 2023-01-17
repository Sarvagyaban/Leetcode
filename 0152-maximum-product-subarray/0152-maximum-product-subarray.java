class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int mul=1;
        for(int i=0;i<nums.length;i++)
        {
            mul*=nums[i];
            ans=Math.max(ans,mul);
            if(mul==0)
            {
                mul=1;
            }
        }
        mul=1;
        for(int i=nums.length-1;i>=0;i--){
            mul*=nums[i];
            ans=Math.max(ans,mul);
            if(mul==0)
            {
                mul=1;
            }
        }
        return ans;
    }
}