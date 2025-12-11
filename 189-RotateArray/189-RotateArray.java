// Last updated: 11/12/2025, 10:28:04 pm
1class Solution {
2    public void rotate(int[] nums, int k) {
3        k = k % nums.length ;
4        reverse( nums , 0 , nums.length-1 );
5        reverse( nums , 0 , k-1);
6        reverse( nums , k , nums.length-1 );
7        
8
9        return ;
10    }
11
12    public void reverse( int[] arr , int left , int right ){
13        while( left <= right) {
14            int temp = arr[left ];
15            arr[left] = arr[right];
16            arr[right] = temp ;
17
18            left++;
19            right--;
20        }
21        return ;
22    }
23}