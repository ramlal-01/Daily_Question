// Last updated: 12/12/2025, 12:27:21 pm
1class Solution {
2    public void sortColors(int[] nums) {
3        int zero = 0 , one =0 , two =0 ;
4
5        for( int ele : nums){
6            if( ele == 0  ) zero++;
7            else if( ele == 1 ) one++;
8            else two++;
9        }
10        int k =0 ;
11        for( int i =0 ; i<zero ; i++ ){
12            nums[k++] =0 ;
13        }
14        for( int i=0  ; i<one ; i++ ){
15            nums[k++] =1 ;
16        }
17        for( int i =0 ; i<two ; i++ ){
18            nums[k++] =2 ;
19        }
20    }
21}