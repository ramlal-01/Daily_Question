// Last updated: 12/10/2026, 1:05:52 pm
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = -1 ;
4        for( int i = 0 ; i<nums.length ; i++){
5            if( nums[i]==0){
6                j= i ;
7                break;
8            }
9        }
10        if (j == -1) return; 
11        for(int i = j+1 ; i<nums.length ; i++){
12            if( nums[i]!=0){
13                swap( i , j , nums);
14                j++;
15            }
16        }
17    }
18
19    public void swap( int i , int j , int[] arr){
20        int temp= arr[i];
21        arr[i]=arr[j];
22        arr[j]= temp;
23    }
24}