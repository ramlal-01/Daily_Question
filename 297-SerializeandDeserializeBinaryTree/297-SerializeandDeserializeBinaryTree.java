// Last updated: 5/9/2025, 2:21:52 pm
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if( root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add( root);

        while( !q.isEmpty()){
            TreeNode n = q.poll();

            if( n==null){
            res.append("n ");
            continue;
            }
            res.append( n.val+" ");

            q.add( n.left);
            q.add( n.right);
        }

        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;

        String[] vals = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1; // index for vals[]
        while (!q.isEmpty() && i < vals.length) {
            TreeNode parent = q.poll();

            // left child
            if (!vals[i].equals("n")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(vals[i]));
                parent.left = leftNode;
                q.add(leftNode);
            }
            i++;

            // right child
            if (i < vals.length && !vals[i].equals("n")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(vals[i]));
                parent.right = rightNode;
                q.add(rightNode);
            }
            i++;
        }
        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));