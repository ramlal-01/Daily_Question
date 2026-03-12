// Last updated: 12/3/2026, 3:02:27 pm
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
27            List<Integer> res = new ArrayList<>() ;
28            for( int i =0 ; i<size ; i++ ){
29                TreeNode curr = que.poll() ;
30                res.add( curr.val );
31                if( curr.left!=null ) {
32                    que.add( curr.left);
33                }
34                if( curr.right!=null ) {
35                    que.add( curr.right);
36                }
37            }
38
39            if( level%2==0) {
40                Collections.reverse(res);
41            }
42            list.add(new ArrayList<>(res) );
43
44            level = 1-level;
45        }
46        return list ;
47    }
48}