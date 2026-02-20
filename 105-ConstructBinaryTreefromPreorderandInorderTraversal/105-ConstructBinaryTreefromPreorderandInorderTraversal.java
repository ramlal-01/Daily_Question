// Last updated: 20/2/2026, 3:05:54 pm
1class Solution {
2
3    int preIdx = 0;
4
5    public TreeNode buildTree(int[] preorder, int[] inorder) {
6        return helper(preorder, inorder, 0, inorder.length - 1);
7    }
8
9    public TreeNode helper(int[] pre, int[] in, int low, int high) {
10        if (low > high) {
11            return null;
12        }
13
14        TreeNode root = new TreeNode(pre[preIdx++]);
15
16        int inIdx = search(in, root.val);
17
18        root.left = helper(pre, in, low, inIdx - 1);
19        root.right = helper(pre, in, inIdx + 1, high);
20
21        return root;
22    }
23
24    public int search(int[] in, int val) {
25        for (int i = 0; i < in.length; i++) {
26            if (in[i] == val) return i;
27        }
28        return -1;
29    }
30}