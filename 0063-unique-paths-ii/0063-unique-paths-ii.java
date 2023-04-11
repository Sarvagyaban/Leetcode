class Solution {
    public int uniquePathsWithObstacles(int[][] arr1) {
        int m=arr1.length;
        int n=arr1[0].length;
        int [][] arr =new int[m][n]; 
        if(arr1[0][0]==1) return 0;
        for(int i=0;i<arr1[0].length;i++)
        {
         if(arr1[0][i]==1)
            {break;}
            else
            {arr[0][i]=1;}
        }
        for(int i=0;i<arr1.length;i++)
        {
           if(arr1[i][0]==1)
            {break;}
            else
            {arr[i][0]=1;}
        }
    
       for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr1[i][j]==1)
                {
                    arr[i][j]=0;
                }
                else
                {
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }}
        }
        return arr[m-1][n-1];
        
    }
}