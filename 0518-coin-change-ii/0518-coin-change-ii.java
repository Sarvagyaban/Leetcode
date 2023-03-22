class Solution {
    public int change(int amount, int[] coins) 
    {
     int arr[]=new int[amount+1];
        arr[0]=1;
        for(int coin:coins)
        {
            for(int i=coin;i<=amount;i++)
            {
                arr[i]+=arr[i-coin];
            }
        }
        return arr[amount];
    }
}