class Solution {
    public int subarraySum(int[] nums, int k) 
    {
    int sum=0;
        int count=0;
        int i=0;
        int j=0;
        int su=0;
     for (i = 0; i < nums.length; i++) {
         su=0;
    for (j = i; j < nums.length; j++)
    {
      su+=nums[j];
        if(su==k)  
        { count++;}
    }
}
        return count;
    }
}