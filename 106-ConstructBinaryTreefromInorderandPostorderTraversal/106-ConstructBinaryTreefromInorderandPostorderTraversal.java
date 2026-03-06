// Last updated: 6/3/2026, 11:21:14 pm
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
17    int poind ;
18    public TreeNode buildTree(int[] in, int[] po) {
19        poind = po.length-1 ;
20        return helper( in , po , 0 , po.length-1 );
21    }
22    public TreeNode helper( int[] in , int[] po , int low , int high ){
23        if( low>high){
24            return null ;
25        }
26        TreeNode node = new TreeNode(po[poind--]) ;
27        int inind = helper( in , node.val) ;
28        node.right = helper( in , po , inind+1 , high );
29        node.left = helper( in , po , low , inind-1 );
30
31        return node ;
32    }
33    public int helper( int in[] , int val ){
34        for( int i =0 ; i<in.length ; i++ ){
35            if( in[i]==val) return i ;
36        }
37        return -1 ;
38    }
39}