// Last updated: 28/2/2026, 8:08:47 pm
1class Solution {
2    public int[] minDistinctFreqPair(int[] nums) {
3        int map[] = new int[102] ;
4    
5        for( int ele : nums){
6            map[ele]++;
7        }
8
9        int one = 0 ;
10        int freq1 = 0 ;
11        for( int i = 0 ; i<=101 ; i++ ){
12            if( map[i]!=0 ){
13                one = i ;
14                freq1 = map[i]  ;
15                break ;
16            }
17        }
18
19        int two = -1 ;
20        int freq2 = 0 ;
21        for( int i= one+1 ; i<=101 ;i++){
22            if( map[i]!=0 && map[i]!=freq1 ){
23                two = i ;
24                freq2 = map[i];
25                break;
26            }
27        }
28
29        if( two!=-1){
30            return new int[]{one,two};
31        }
32        return new int[]{-1,-1};
33    }
34}