// Last updated: 12/3/2026, 11:04:05 am
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> list = new ArrayList<>() ;
19        if( root==null) return list ;
20        Queue<TreeNode> q = new LinkedList<>() ;
21        q.add(root) ;
22        while( !q.isEmpty() ){
23            int size = q.size() ;
24            List<Integer> arr = new ArrayList<>() ;
25            for( int i=0 ;i<size ; i++ ) {
26                TreeNode curr = q.poll() ;
27                arr.add(curr.val) ;
28                if( curr.left!=null){
29                    q.add(curr.left);
30                }
31                if( curr.right!=null){
32                    q.add(curr.right);
33                }
34            }
35            list.add(arr);
36        }
37        return list ;
38    }
39}