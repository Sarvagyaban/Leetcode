class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        for(int i = m;i<m+n;i++)
        {
            nums1[i]=nums2[i-m];
        }
       Arrays.sort(nums1);
        for(int i = 0;i<m;i++)
       {
           System.out.print(nums1[i]);
       }
        

    }
}