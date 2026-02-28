// Last updated: 1/3/2026, 12:22:34 am
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }1111111111116-4444225
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18        return isSameTree( root.left , root.right);
19    }
20
21    public boolean isSameTree(TreeNode p, TreeNode q) {
22       
23        if( p==null && q==null ) {
24            return true ;
25        }
26        if( p==null && q!=null ) return false ;
27        if( q==null && p!=null ) return false ;
28        if( p.val != q.val ){
29            return false ;
30        }
31
32
33        boolean left = isSameTree( p.left , q.right ) ;
34        if( !left) return false ;
35        boolean right = isSameTree( p.right , q.left );
36        if( !right) return false ;
37
38        return left&& right ;
39    }
40}