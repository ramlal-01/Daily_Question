// Last updated: 12/3/2026, 11:31:59 am
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
17    public boolean isSymmetric(TreeNode root) {
18        if( root==null ) return true ;
19        return helper( root.left , root.right ) ;
20    }
21
22    public boolean helper( TreeNode p , TreeNode q ){
23        if( p==null && q==null ){
24            return true ;
25        }
26        if( p==null && q!=null ) return false ;
27        if( q==null && p!=null ) return false ;
28        
29        if( p.val!=q.val ) return false ;
30        boolean left = helper( p.left , q.right ) ;
31        if(!left ) return false ;
32
33        boolean right = helper( p.right , q.left ) ;
34        if( !right ) return false ;
35
36        return true ;
37    }
38}