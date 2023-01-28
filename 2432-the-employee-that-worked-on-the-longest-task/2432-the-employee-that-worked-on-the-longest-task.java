class Solution {
    public int hardestWorker(int n, int[][] logs) 
    {
        int max=logs[0][1];
        int ans=logs[0][0];
        int pre=max;
        for(int i=1;i<logs.length;i++)
        {
            if(logs[i][1]-pre>max)
            {
                max=logs[i][1]-pre;
                ans=logs[i][0];
            }
            else if(logs[i][1]-pre==max){
                if(logs[i][0]<ans){
                    ans=logs[i][0];
                }
            }
            pre=logs[i][1];
        }
        return ans;
    }
}