// Last updated: 24/2/2026, 4:13:58 pm
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18       // if( p==null || q==null ) return false ;
19        if( p==null && q==null ) {
20            return true ;
21        }
22        if( p==null && q!=null ) return false ;
23        if( q==null && p!=null ) return false ;
24        if( p.val != q.val ){
25            return false ;
26        }
27
28
29        boolean left = isSameTree( p.left , q.left ) ;
30        if( !left) return false ;
31        boolean right = isSameTree( p.right , q.right );
32        if( !right) return false ;
33
34        return left&& right ;
35    }
36}