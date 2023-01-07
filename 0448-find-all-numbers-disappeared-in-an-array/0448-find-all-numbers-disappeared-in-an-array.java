class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<Integer>();
        int temp=1;
        int i=0;
        int f=0;
        while(i<nums.length&&temp<=nums.length){
            if(nums[i]==temp){
                f=temp;
                temp++;
                i++;
            }
            else if(nums[i]<temp){
                if(nums[i]==f){
                    i++;
                    continue;
                }
                lst.add(temp);
                f=nums[i];
                i++;
            }
            else{
                lst.add(temp);
                temp++;
            }
        }
        while(temp<=nums.length){
            lst.add(temp);
            temp++;
        }
        return lst;
    }
}