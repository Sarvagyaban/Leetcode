class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length-1; i++) 
    {
if(nums[i]==nums[i+1])
{
    list.add(nums[i]);
}
    }
    return list;
    }
}