class Solution {
    public int calPoints(String[] operations) {
        int a[]=new int[operations.length];
        int ans=0,c=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")) a[c++]=a[c-2]+a[c-3];
            else if(operations[i].equals("D")) a[c++]=2*a[c-2];
            else if(operations[i].equals("C")) c--;
            else a[c++]=Integer.parseInt(operations[i]);
        }
        for(int i=0;i<c;i++)
        ans+=a[i];
        return ans;
    }
}