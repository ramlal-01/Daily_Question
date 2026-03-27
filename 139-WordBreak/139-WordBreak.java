// Last updated: 27/3/2026, 11:01:57 pm
1class Solution {
2    int count  = 0 ;
3    public int countArrangement(int n) { 
4        boolean arr[] = new boolean[n+1];
5        helper( n , arr , 1);
6        
7        // System.out.println(res);
8        return count;
9    }
10
11    public void helper( int n  , boolean[] arr , int ind ){
12        if(  ind>n){
13            count++;
14            return ;
15        }
16        
17
18        for( int i = 1 ; i<=n ; i++){
19            if( arr[i]) continue ;
20
21            arr[i] = true ; 
22
23            if( i% ind==0 || ind%i==0 ){ 
24                helper( n , arr , ind+1); 
25            }
26            arr[i] = false;
27        }
28    }
29}