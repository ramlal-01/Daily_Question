// Last updated: 12/10/2026, 8:18:32 pm
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
17    public int maxLevelSum(TreeNode root) {
18        Queue<TreeNode> q  = new ArrayDeque<>() ;
19        q.add( root ) ;
20
21        int maxi = Integer.MIN_VALUE ;
22        int level = 0 ;
23        int i = 1 ;
24        while( !q.isEmpty()){
25            int size = q.size() ;
26
27            int sum = 0 ;
28            for( int j = 1 ; j<=size ; j++ ){
29                TreeNode node = q.poll() ;
30                sum+= node.val ;
31
32                if( node.left!=null ) q.add( node.left ) ;
33                if( node.right!=null ) q.add( node.right ) ;
34
35            }
36            if( maxi < sum ){
37                maxi = sum ;
38                level = i ;
39            }
40            i++ ;
41        }
42
43        return level ;
44    }
45}