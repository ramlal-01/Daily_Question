// Last updated: 26/7/2026, 10:53:54 pm
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> list = new ArrayList<>();
4
5        Arrays.sort( nums );
6        int n = nums.length ; 
7
8        for( int i = 0 ; i<n ; i++){
9            if( i>0 && nums[i]==nums[i-1]) continue ;
10
11            for( int j = i+1 ; j<n;){
12                int p = j+1 , q = n-1 ;
13
14                while( p<q ){
15                    long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];
16
17                    if( sum == target ){
18                        list.add( Arrays.asList( nums[i] , nums[j] , nums[p], nums[q]));
19                        p++; 
20                        q--;
21                        while( p<q && nums[p]==nums[p-1]) p++; 
22                    }
23                    else if( sum<target){
24                        p++;
25                    }
26                    else{
27                        q--;
28                    }
29                    
30                }
31                j++;
32                while( j<n && nums[j]==nums[j-1]) j++;
33            }
34        }
35        return list;
36    }
37}