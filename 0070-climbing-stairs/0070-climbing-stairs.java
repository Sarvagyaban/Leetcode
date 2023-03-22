class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
        //this is a fibonacci series question
        //just initalize both 0 & 1 position by 1 only because there is no 0th step in stair
    }
}