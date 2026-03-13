// Last updated: 13/3/2026, 4:42:53 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if( root==null || root==p || root==q ) {
14            return root ;
15        }
16
17        if( p.val < root.val && q.val < root.val ){
18            return lowestCommonAncestor(root.left , p , q );
19        }
20
21        else if( p.val > root.val && q.val > root.val ){
22            return lowestCommonAncestor(root.right , p , q );
23        }
24
25        else return root ;
26    }
27}