class Solution {
    public int findMiddleIndex(int[] nums) 
    {
    int[] sum = new int[nums.length];
    int[] sum1 = new int[nums.length];

sum[0] = 0;
for (int i=1;i<nums.length;i++)
{
  sum[i] = sum[i - 1] + nums[i - 1];
}       
sum1[nums.length-1] = 0;
        for (int i=nums.length-2;i>=0;i--)
{
  sum1[i] = sum1[i + 1] + nums[i + 1];
}       
        for (int i=0;i<nums.length;i++)
        {
            if(sum[i]==sum1[i])
            {
                return i;
            }
        }
        return -1;
    }
}