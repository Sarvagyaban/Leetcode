class Solution
{
    public int[] sortArrayByParity(int[] nums)
    {
        
        int length=nums.length;
          int j=0;
        if(length==0)
            return null;
        if(length==1)
            return nums;
      
       // int ans[]=new int[length];
        for(int i=0;i<length;i++)
        {
            if(nums[i] % 2 == 0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return nums;
    }
}