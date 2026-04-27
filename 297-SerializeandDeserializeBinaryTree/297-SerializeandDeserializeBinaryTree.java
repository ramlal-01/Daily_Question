// Last updated: 27/4/2026, 10:56:34 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        if( root == null) return "";
15        Queue<TreeNode> q = new LinkedList<>();
16        StringBuilder res = new StringBuilder();
17        q.add( root);
18
19        while( !q.isEmpty()){
20            TreeNode n = q.poll();
21
22            if( n==null){
23            res.append("n ");
24            continue;
25            }
26            res.append( n.val+" ");
27
28            q.add( n.left);
29            q.add( n.right);
30        }
31
32        return res.toString();
33    }
34
35    // Decodes your encoded data to tree.
36    public TreeNode deserialize(String data) {
37        if (data.equals("")) return null;
38
39        String[] vals = data.split(" ");
40        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
41        Queue<TreeNode> q = new LinkedList<>();
42        q.add(root);
43
44        int i = 1; // index for vals[]
45        while (!q.isEmpty() && i < vals.length) {
46            TreeNode parent = q.poll();
47
48            // left child
49            if (!vals[i].equals("n")) {
50                TreeNode leftNode = new TreeNode(Integer.parseInt(vals[i]));
51                parent.left = leftNode;
52                q.add(leftNode);
53            }
54            i++;
55
56            // right child
57            if (i < vals.length && !vals[i].equals("n")) {
58                TreeNode rightNode = new TreeNode(Integer.parseInt(vals[i]));
59                parent.right = rightNode;
60                q.add(rightNode);
61            }
62            i++;
63        }
64        return root;
65
66    }
67}
68
69// Your Codec object will be instantiated and called as such:
70// Codec ser = new Codec();
71// Codec deser = new Codec();
72// TreeNode ans = deser.deserialize(ser.serialize(root));