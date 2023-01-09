class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int n=nums.length;
        int[] ans=new int[n];
        int pi=0;
        int ni=1;
        for(int i:nums){
            if(i>=0){
                ans[pi]=i;
                pi+=2;
            }else{
                ans[ni]=i;
                ni+=2;
            }
        }
        return ans;
    }
}