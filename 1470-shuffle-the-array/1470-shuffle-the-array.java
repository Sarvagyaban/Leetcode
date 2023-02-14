class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
     int t=0;
        int res[]=new int[nums.length];
        for(int i=0;i<n;i++)
     {
             res[t]=nums[i];
             t++;
             res[t]=nums[res.length/2+i];
             t++;
         
     }
        return res;
    }
}