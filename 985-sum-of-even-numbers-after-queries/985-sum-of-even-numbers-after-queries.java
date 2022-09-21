class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res=new int[nums.length];
        int s=0,k=0;
        for(int n:nums)
            if(n%2==0)
                s+=n;
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0],pos=queries[i][1];
            if(nums[pos]%2==0)s-=nums[pos];
            nums[pos]+=val;
            if(nums[pos]%2==0)s+=nums[pos];
            res[i]=s;
        }
        return res;
    }
}