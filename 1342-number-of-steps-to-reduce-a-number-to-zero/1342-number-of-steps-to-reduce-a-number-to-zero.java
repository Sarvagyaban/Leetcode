class Solution {
    public int numberOfSteps(int n) {
        int count=0;
        while(n!=0)
        {
            count++;
            if(n%2==0)
            {
                n=n/2;
            }
            else
            {
                n=n-1;
            }
        }
        return count;
    }
}