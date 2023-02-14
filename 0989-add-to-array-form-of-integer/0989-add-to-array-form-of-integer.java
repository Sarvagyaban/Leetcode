class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        List<Integer> list=new ArrayList<Integer>();
        int c=0;
        for(int i=num.length-1;i>=0;i--)
        {
            int temp=num[i]+(k%10)+c;
            list.add(0,temp%10);
            k/=10;
            c=temp/10;
        }
        while(k>0){
            int temp=(k%10)+c;
            list.add(0,temp%10);
            c=temp/10;
            k/=10;
        }
        if(c>0){
            list.add(0,c);
        }
        return list;
    }
}