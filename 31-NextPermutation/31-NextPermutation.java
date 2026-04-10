// Last updated: 10/4/2026, 11:42:06 pm
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int ind = -1 ;
4        int n = nums.length ;
5        for( int i= n-2 ; i>=0 ; i--){
6            if( nums[i]<nums[i+1]){
7                ind = i;
8                break ; 
9            }
10        }
11
12        if( ind==-1) {
13            reverse( nums , 0 , n-1); 
14            return ; 
15        }
16        for ( int i = n-1 ; i>ind ; i--){
17            if( nums[i]> nums[ind]){
18                swap( nums , i , ind );
19                break;
20            }
21        }
22
23        reverse( nums , ind +1, n-1);
24
25    }  
26 
27    public static void reverse(int[] arr , int left ,int right) { 
28
29        while (left < right) {
30            // Swap elements
31            int temp = arr[left];
32            arr[left] = arr[right];
33            arr[right] = temp;
34
35            left++;
36            right--;
37        }
38    }
39
40    public static void swap(int[] arr, int i, int j) {
41        int temp = arr[i];
42        arr[i] = arr[j];
43        arr[j] = temp;
44    }
45
46}