public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "X";
        }
        String leftSerialized=serialize(root.left);
        String rightSerialized=serialize(root.right);
        return root.val + "," + leftSerialized + "," + rightSerialized;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodesLeft=new LinkedList<>();
        nodesLeft.addAll(Arrays.asList(data.split(",")));
        return deserializeHelper(nodesLeft);
    }
    public TreeNode deserializeHelper(Queue<String> nodesLeft){
    String valueForNode=nodesLeft.poll();
    if(valueForNode.equals("X"))
     return null;
    TreeNode newNode=new TreeNode(Integer.valueOf(valueForNode));
    newNode.left=deserializeHelper(nodesLeft);
    newNode.right=deserializeHelper(nodesLeft);
    return newNode;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));