class Solution {
    public int countDistinctIntegers(int[] nums) 
    {
        int arr[]=new int[nums.length*2];
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
        int n=nums[i];
        int sum=0;
        int rem=0;
        while(n>0)
        {
        rem=n%10;
        sum=(sum*10)+rem;
        n=n/10;
        }
        arr[nums.length+i]=sum;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            count++;
        }
        return count;
    }
}