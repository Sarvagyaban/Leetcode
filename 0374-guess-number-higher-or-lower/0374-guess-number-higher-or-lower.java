public class Solution extends GuessGame {
    public int guessNumber(int n) 
    {
     int low=0;
     int high=n;
    while(low<=high) 
     {
    int mid=low+(high-low)/2;
     int ans=guess(mid);
     if(ans==0)
     {
    return mid;
     }
     else
     if(ans==1)
     {
low=mid+1;
     }
     else
     if(ans==-1)
     {
        high=mid-1;
     }}
     return -1;
    }
}