class Solution {
    public int[] vowelStrings(String[] words, int[][] nums) 
    {
        int arr[]=new int [words.length];
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            if((s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')&&(s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u'))
            {
                count++;
            }
            arr[i]=count;
        }
        int res[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i][0]==0){
                res[i]=arr[nums[i][1]];
            }
            else{
                res[i]=arr[nums[i][1]]-arr[nums[i][0]-1];
            }
        }
        return res;
    }
}