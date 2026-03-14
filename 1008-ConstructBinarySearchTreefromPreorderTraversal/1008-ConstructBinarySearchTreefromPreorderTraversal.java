// Last updated: 14/3/2026, 11:32:48 am
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
17    public TreeNode bstFromPreorder(int[] preorder) {
18        TreeNode root = new TreeNode(preorder[0]) ;
19
20        for( int i =1 ; i<preorder.length ; i++ ){
21            insertIntoBST( root , preorder[i]);
22        }
23
24        return root ;
25    }
26
27    public TreeNode insertIntoBST(TreeNode root, int val) {
28        if( root==null ){
29            TreeNode node = new TreeNode(val) ;
30            return node ; 
31        }
32
33        if( root.val < val ) {
34            root.right = insertIntoBST( root.right , val ) ;
35        }
36        else if( root.val > val ){
37            root.left = insertIntoBST( root.left , val ) ;
38        }
39        return root ;
40    }
41
42}