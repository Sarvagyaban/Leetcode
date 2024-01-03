class Solution {
    public double average(int[] salary) 
    {
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        double sum=0;
        for(int i=0;i<salary.length;i++)
        {
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
            sum+=salary[i];
        }
        return (sum-min-max)/(salary.length-2);
    }
}