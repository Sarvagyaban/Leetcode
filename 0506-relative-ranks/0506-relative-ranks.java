class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
    int rank=1;
    String res[]=new String [score.length];
    for(int i=0;i<score.length;i++)
    {
        int max=0;
            for(int j=1;j<score.length;j++)
            {
                if(score[j]>score[max])
                    max=j;
            }
        res[max]=String.valueOf(rank);
        rank++;
        score[max]=-1;
    }
       for(int i=0;i<res.length;i++){
            if(Integer.parseInt(res[i])==1){
                res[i]="Gold Medal";
            }
            else if(Integer.parseInt(res[i])==2){
                res[i]="Silver Medal";
            }
            else if(Integer.parseInt(res[i])==3){
                res[i]="Bronze Medal";
            }
        }
        return res;

        
    }
}