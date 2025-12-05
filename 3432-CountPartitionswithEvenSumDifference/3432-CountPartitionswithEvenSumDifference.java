// Last updated: 5/12/2025, 11:00:54 pm
1class Solution {
2    public int countPartitions(int[] nums) {
3        int sum = 0 ;
4        for( int ele : nums){
5            sum+= ele ;
6        }
7        int prefix = 0 ;
8        int c = 0 ;
9        for( int ele : nums){
10            prefix+= ele ;
11            int var = sum - prefix ;
12
13            if( (prefix - var)%2 ==0 && var!=0 ){
14                c++;
15            }
16
17            
18        }
19        return c ;
20    }
21}