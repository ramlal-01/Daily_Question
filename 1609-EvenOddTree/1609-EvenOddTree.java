// Last updated: 12/2/2026, 2:56:09 pm
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
17    public boolean isEvenOddTree(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>() ;
19        q.add(root) ;
20
21        int level = 0;
22        while(!q.isEmpty() ){
23            int size = q.size() ;
24            List<Integer> list = new ArrayList<>();
25            for( int i =0 ; i<size; i++ ){
26                TreeNode curr = q.poll() ; 
27                list.add( curr.val );
28                
29                
30                if( curr.left!=null ) {
31                    q.add( curr.left );
32                    
33                }
34                if( curr.right!=null ){ 
35                    q.add( curr.right );
36                }
37            }
38            if( level%2==0 ){
39                if( allodd(list)==false || incr(list)==false ){
40                    return false ;
41                }
42            }
43            else{
44                if( alleven(list)==false || decr(list)==false ){
45                    return false ;
46                }
47            }
48            level++;
49        }
50        return true ;
51    }
52
53    public static boolean allodd( List<Integer> list ){
54        for( int i =0 ; i<list.size() ; i++ ){
55            if( list.get(i)%2==0){
56                return false;
57            }
58        }
59        return true ;
60    }
61    public static boolean alleven( List<Integer> list ){
62        for( int i =0 ; i<list.size() ; i++ ){
63            if( list.get(i)%2!=0){
64                return false;
65            }
66        }
67        return true ;
68    }
69
70    public static boolean incr( List<Integer> list ){
71        for( int i =1 ; i<list.size() ; i++ ){
72            if( list.get(i)<= list.get(i-1)){
73                return false;
74            }
75        }
76        return true ;
77    }
78    public static boolean decr( List<Integer> list ){
79        for( int i =1 ; i<list.size() ; i++ ){
80            if( list.get(i)>= list.get(i-1)){
81                return false;
82            }
83        }
84        return true ;
85    }
86}