// Last updated: 12/3/2026, 3:52:59 pm
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> list = new ArrayList<>() ;
19        helper( root , targetSum , list , 0 , new ArrayList<>() );
20        return list ;
21    }
22    public void helper( TreeNode root , int tar , List<List<Integer>> list , int sum , List<Integer> res ){
23        
24        if( root==null ) { 
25            return ;
26        }
27
28        if(root.left==null && root.right==null ){
29            if( (sum+root.val )==tar ){ 
30                res.add( root.val ) ;
31                list.add( new ArrayList<>(res) ) ;
32                res.remove( res.size()-1);
33            }
34            return ;
35        } 
36        // System.out.println(root.val ) ;
37        res.add(root.val) ;
38        helper( root.left , tar , list , sum + root.val , res ) ;
39
40
41        helper( root.right , tar , list , sum + root.val , res ) ;
42        res.remove( res.size()-1);
43    }
44}