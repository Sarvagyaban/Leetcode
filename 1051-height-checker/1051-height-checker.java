class Solution {
    public int heightChecker(int[] a) 
    {
    int b [] = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(b[i]!=a[i])
                count++;
        }
        return count;
    }
}