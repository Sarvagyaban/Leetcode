class Solution {
    public int maximumDifference(int[] prices) {
        if(prices.length==0)return 0;
        int min=prices[0];
        int profit=0;
        int max=0;
        for(int arr:prices)
        {
            min=Math.min(min,arr);
            profit=arr-min;
            max=Math.max(max,profit);
        }
        return (max>0)?max:-1;
    }
}