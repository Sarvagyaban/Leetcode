class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int even[];
        if(nums.length%2==0){
            even=new int[nums.length/2];
        }
        else{
            even=new int[(nums.length/2)+1];
        }
        int odd[]=new int[nums.length/2];
        int e=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even[e]=nums[i];
                e++;
            }
            else{
                odd[o]=nums[i];
                o++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        e=0;
        o=odd.length-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[e];
                e++;
            }
            else{
                nums[i]=odd[o];
                o--;
            }
        }
        return nums;
    }
}