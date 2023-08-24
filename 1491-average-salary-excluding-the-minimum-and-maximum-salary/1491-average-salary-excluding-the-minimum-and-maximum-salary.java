class Solution {
    public double average(int[] salary) 
    {
    double min=Double.MAX_VALUE;
    double max=Double.MIN_VALUE;
    double tot=0;
        for(int i=0;i<salary.length;i++)
        {
            min=Math.min(salary[i],min);
            max=Math.max(salary[i],max);
            tot+=salary[i];
        }
        return (tot-min-max)/(salary.length-2.0);
    }
}