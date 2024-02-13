class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans[]=new int[100001];
        for(int x:nums){
            ans[x]++;
        }
        int maxcount=0;
        int res=-1;
        for(int i=0;i<ans.length;i++){
            if(i%2==0 && ans[i]>maxcount){
                maxcount=ans[i];
                res=i;
            }
        }
        return res;
    }
}