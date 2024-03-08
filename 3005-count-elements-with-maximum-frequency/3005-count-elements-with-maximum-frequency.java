class Solution {
    public int maxFrequencyElements(int[] nums) {
        int res[]=new int[101];
        for(int i=0;i<nums.length;i++){
            res[nums[i]]++;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<res.length;i++){
            max=Math.max(max,res[i]);
        }
        int rest=0;
        for(int i=1;i<=100;i++){
            if(res[i]==max){
                rest+=res[i];
            }
        }
        return rest;
    }
}


