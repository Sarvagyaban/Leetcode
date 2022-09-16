class Solution {
    public int trap(int[] height) {
        return rain(height);
    }
    public static int rain(int [] arr){
        int l[]=new int[arr.length];
        l[0]=arr[0];
        for (int i=1;i<l.length;i++){
            l[i]=Math.max(l[i-1],arr[i]);
        }
        int n=arr.length;
        int []r=new int[n];
        r[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],arr[i]);
        }
        int sum=0;
        for (int i=0;i<r.length;i++){
            sum=sum+Math.min(l[i],r[i])-arr[i];
        }
        return sum;
    }
}