class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int t=i;
            int f=1;
            while(t>0){
                int x=t%10;
                if(x==0){
                    f=0;
                    break;
                }
                if(i%x==0){
                    t/=10;
                    continue;
                }
                else{
                    f=0;
                    break;
                }
            }
            if(f==1){
                res.add(i);
            }
        }
        return res;
    }
}