 class Solution {
    public int sumNumbers(TreeNode root) 
    {
     return sum(root,0);   
    }
    public int sum(TreeNode root,int n)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return n*10 + root.val;
        }
        int ls=sum(root.left,n*10+root.val);
        int rs=sum(root.right,n*10+root.val);
        return ls+rs;
    }
}