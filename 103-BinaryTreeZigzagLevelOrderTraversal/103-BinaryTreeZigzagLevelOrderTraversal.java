// Last updated: 26/2/2026, 12:17:22 pm
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        
19        List<List<Integer>> list = new ArrayList<>() ;
20        if( root==null) return list ;
21        Queue<TreeNode> que  = new LinkedList<>() ;
22
23        que.add(root) ;
24        int level = 1 ;
25        while( !que.isEmpty()){
26            int size = que.size() ;
27            
28            List<Integer> res = new ArrayList<>() ;
29            for( int i =0 ; i<size ; i++ ){
30                TreeNode curr = que.poll() ;
31                res.add( curr.val );
32                if( curr.left!=null ) {
33                    que.add( curr.left);
34                }
35                if( curr.right!=null ) {
36                    que.add( curr.right);
37                }
38            }
39
40            if( level%2==0) {
41                Collections.reverse(res);
42            }
43            list.add(new ArrayList<>(res) );
44
45            level = 1-level;
46        }
47        return list ;
48    }
49}