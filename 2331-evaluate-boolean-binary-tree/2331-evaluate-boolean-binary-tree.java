class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            if(root.val==0){
                return false;
            }
            else{
                return true;
            }
        }
        if(root.val==2){
            return evaluateTree(root.left) || evaluateTree(root.right);
        }
        if(root.val==3){
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
        return false;
    }
}