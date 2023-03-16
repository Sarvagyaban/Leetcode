class Solution {
    public double average(int[] salary) {
        double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;
        double sum=0;
for(int i=0;i<salary.length;i++)
{
sum+=salary[i];
    max=Math.max(max,salary[i]);
    min=Math.min(min,salary[i]);
}
return ((sum-max-min)/(salary.length-2));
    }
}