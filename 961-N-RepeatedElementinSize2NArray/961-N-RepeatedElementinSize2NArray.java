// Last updated: 2/1/2026, 8:15:08 am
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        int n = nums.length/2 ;
4        int max = 0 ;
5        for( int ele : nums) { max = Math.max( max , ele ) ; }
6
7        int map[] = new int[max+1];
8
9        for( int ele : nums){
10            map[ele]++;
11        }
12
13        for( int i=0;i<max+1 ; i++ ){
14            if( map[i]== n ) return i ;
15        }
16        return -1 ;
17    }
18}