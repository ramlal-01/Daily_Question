// Last updated: 8/2/2026, 9:24:56 am
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
17    public boolean isBalanced(TreeNode root) {
18        return check( root)!=-1 ;
19    }
20
21    public int check ( TreeNode root ){
22        if( root == null){
23            return 0;
24        }
25
26        int lh = check( root.left);
27        if( lh==-1) return -1 ;
28        int rh = check( root.right);
29        if( rh == -1 ) return -1 ;
30
31        if( Math.abs( lh-rh)>1 ) return -1 ;
32
33        return 1+ Math.max(lh,rh);
34    }
35}