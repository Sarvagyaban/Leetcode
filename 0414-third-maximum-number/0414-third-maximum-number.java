class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int temp=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==temp){
                continue;
            }
            else{
                temp=nums[i];
                c++;
            }
            if(c==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}