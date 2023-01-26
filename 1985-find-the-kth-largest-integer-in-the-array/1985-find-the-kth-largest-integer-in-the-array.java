import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) 
    {
        BigInteger arr[]=new BigInteger[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=new BigInteger(nums[i]);
        }
        Arrays.sort(arr);
        String s=String.valueOf(arr[arr.length-k]);
        return s;
    }
}