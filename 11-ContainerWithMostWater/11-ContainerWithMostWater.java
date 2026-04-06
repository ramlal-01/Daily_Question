// Last updated: 6/4/2026, 2:44:43 pm
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length ;
4
5        for( int i = n-1 ; i>=0 ; i-- ){
6            if( digits[i]<9 ){
7                digits[i]++;
8                return digits ;
9            }
10            digits[i] = 0 ;
11        }
12
13        int arr[] = new int[n+1] ;
14
15        arr[0] = 1 ;
16
17        return arr ;
18    }
19}