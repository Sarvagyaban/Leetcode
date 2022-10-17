class Solution {
    public void rotate(int[] nums, int k) 
    {
    int n=nums.length;
    k=k%n;
    reversearray(nums,0,n-k-1);
	reversearray(nums,n-k,n-1);
	reversearray(nums,0,n-1);
    }    
    public static void reversearray(int[] arr,int i,int j )
	{
	
	while(i<j)
	{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;
	}
	
	}    
        
        
}