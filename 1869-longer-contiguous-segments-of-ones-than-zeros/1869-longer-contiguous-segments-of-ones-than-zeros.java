class Solution {
    public boolean checkZeroOnes(String s) 
    {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i)-'0';
        }
        int ecount=0;
        int ocount=0;
        int maxe=0;
        int maxo=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            { 
                ecount++;
                maxo=Math.max(maxo,ocount);
                ocount=0;
            }
            else
            {
                ocount++;
                maxe=Math.max(maxe,ecount);
                ecount=0;
            }     
        }
        maxo=Math.max(maxo,ocount);
        maxe=Math.max(maxe,ecount);
        // System.out.println(maxe+" "+maxo);
        if(maxe>maxo)
            return true;
        else
            return false;
    }
}