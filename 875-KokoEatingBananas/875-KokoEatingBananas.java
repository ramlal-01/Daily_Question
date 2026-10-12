// Last updated: 12/10/2026, 11:14:43 pm
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low = 1; 
4        int high=0; 
5        for(int ele: piles){
6            high= Math.max( high, ele);
7        } 
8        while( low<= high){
9            int mid = low+ (high-low)/2;
10
11            if( hours( piles , h, mid)){
12                high = mid-1;
13            }
14            else{
15                low = mid+1;
16            }
17        }
18        return low;
19    }
20    public boolean hours( int piles[] , int h , int mid){
21        int t =0;
22
23        for( int ele : piles){ 
24            if(t>h){
25                return false;
26            }
27            t+= Math.ceil( (double)ele/mid);
28             
29        }
30        return t<=h;
31    }
32}