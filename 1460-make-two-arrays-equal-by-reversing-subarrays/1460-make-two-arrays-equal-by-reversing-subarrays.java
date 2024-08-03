class Solution {
    public boolean canBeEqual(int[] nums, int[] arr) 
    {
     Arrays.sort(arr);
        Arrays.sort(nums);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=nums[i])
                return false;
        }
       return true; 
    }
}