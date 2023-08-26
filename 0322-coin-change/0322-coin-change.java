class Solution {
    public int coinChange(int[] coins, int amount) 
    {
     int arr[]=new int[amount+1];
        Arrays.fill(arr,amount+1);
        arr[0]=0;
        for(int coin:coins)
        {
            for(int i=coin;i<=amount;i++)
            {
                arr[i]=Math.min(arr[i],arr[i-coin]+1);
            }
        }
        return arr[amount]<=amount?arr[amount]:-1;
    }
}