// Last updated: 13/2/2026, 10:38:28 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode reverseOddLevels(TreeNode root) {
18        if(root == null)
19        return root;
20        dfs(root.left , root.right , 1 );
21        return root;
22    }
23
24    public void dfs(TreeNode left , TreeNode right , int level){
25        if( left==null || right==null){
26            return ;
27        }
28
29        if( level%2!=0){
30            int temp = left.val;
31            left.val = right.val;
32            right.val = temp ;
33        }
34
35        dfs(left.left , right.right , level+1);
36        dfs(left.right , right.left , level +1);
37    }
38}