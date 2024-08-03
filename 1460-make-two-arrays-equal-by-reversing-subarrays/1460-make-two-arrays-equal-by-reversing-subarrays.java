class Solution {
    public boolean canBeEqual(int[] nums, int[] arr) 
    {
     Arrays.sort(arr);
        Arrays.sort(nums);
        
        return Arrays.equals(arr, nums);
    }
}