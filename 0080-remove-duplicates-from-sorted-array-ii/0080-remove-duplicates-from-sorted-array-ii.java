class Solution {
    public int removeDuplicates(int[] nums) 
    {
     int pos=1;
     int flag=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]){
                nums[pos]=nums[i];
                pos++;   
                flag=0;
            }
            else{
                if((nums[i]==nums[i-1])&&(flag==0))
                {
                    flag=1;
                    nums[pos]=nums[i];
                    pos++;
                }
                else
                {
                    continue;
                }
            }
        }
        return pos;
    }
}