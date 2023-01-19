class Solution {
    public int minMaxGame(int[] nums) {
        int f=0;
        int ind=0;
        for(int size=nums.length;size>0;size=size/2){
            ind=0;
            for(int i=0;i<size-1;i=i+2){
                if(f==0){
                    nums[ind]=Math.min(nums[i],nums[i+1]);
                    f=1;
                }
                else{
                    nums[ind]=Math.max(nums[i],nums[i+1]);
                    f=0;
                }
                ind++;
            }
        }
        return nums[0];
    }
}