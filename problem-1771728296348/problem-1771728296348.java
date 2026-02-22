// Last updated: 22/2/2026, 8:14:56 am
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int one =  0 ;
4        int two = 0 ;
5        int n= nums.length ;
6
7        int flag = 0 ;
8        for( int i =0 ; i<n ;i++){
9            if(nums[i]%2!=0 && (i+1)%6==0  ) flag = flag ;
10            else if( nums[i]%2!=0 || (i+1)%6==0 ){
11                flag = 1-flag ;
12            }
13            //System.out.println(flag);
14            if( flag==0 ){
15                one+= nums[i];
16            }
17            else two+= nums[i];
18        }
19        return one-two;
20    }
21}