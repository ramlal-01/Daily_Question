// Last updated: 1/2/2026, 8:07:33 am
1class Solution {
2    public int countMonobit(int n) {
3        int cnt= 0;
4        
5        for( int i =0 ; i<=n ;  i++){
6            String s = Integer.toBinaryString(i);
7
8            boolean flag = true ;
9            int j = 1 ;
10            while( j<s.length() ){
11                if( s.charAt(j)!= s.charAt(0)){
12                    flag = false ;
13                    break;
14                }
15                j++;
16            }
17
18            if( flag){
19                // System.out.println(s);
20                cnt++;
21            }
22        }
23
24        return cnt;
25    }
26}