// Last updated: 17/2/2026, 8:49:46 pm
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int arr[] = new int[n+1];
4
5        for( int i = 0 ; i<trust.length ; i++){
6            arr[ trust[i][0]]--;
7            arr[ trust[i][1]]++;
8        }
9
10        for( int i = 1 ; i<arr.length ; i++){
11            if( arr[i] == n-1) return i;
12        }
13        return -1 ;
14    }
15}