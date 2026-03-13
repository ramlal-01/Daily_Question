// Last updated: 13/3/2026, 12:57:32 pm
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        int n = nums.length;
19        int l = 0 ;
20        int r = n-1 ;
21    
22        return helper( nums , l , r ) ;
23
24    }
25    public TreeNode helper(  int arr[] , int low ,int high){
26        if( low>high ) return null;
27
28        int mid = middle(arr,low,high) ;
29
30        TreeNode l = helper( arr , low, mid-1 ) ;
31        TreeNode r = helper( arr , mid+1 , high ) ;
32        
33        
34        TreeNode root = new TreeNode(arr[mid]) ;
35
36        root.left  = l ;
37        root.right = r ;
38
39        return root ;
40    }
41
42    public int middle( int[] arr , int left , int right ){
43        int mid = left + ( right-left)/2 ; 
44        return mid ;
45    }
46}