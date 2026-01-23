// Last updated: 23/1/2026, 7:25:01 am
1class Solution {
2    public int maxSumMinProduct(int[] nums) {
3        int mod = (int)1e9+7 ;
4
5        int n = nums.length ;
6        int[] nse = nsefunc(nums);
7        int[] pse = psefunc(nums);
8 
9        long pref[] = new long[n];
10        pref[0] = nums[0];
11        for ( int i =1 ; i<n ;i++){
12            pref[i] = pref[i-1]+nums[i] ;
13        }
14
15        long max = Long.MIN_VALUE ;
16        for( int i =0 ; i<n ; i++){
17            int x = pse[i] ;
18            int y = nse[i] ;
19
20            long psum = x==-1 ? 0 : pref[x];
21
22            long nsum= pref[y-1] ;
23
24            long diff = nsum-psum;
25            max = Math.max( max , diff*nums[i] );
26        }
27        return (int)(max%mod );
28
29    }
30
31    public int[] nsefunc( int[] arr ){
32        int n = arr.length ;
33
34        Stack<Integer> st = new Stack<>();
35        int res[] = new int[n];
36        for( int i =n-1 ; i>=0 ; i--){
37
38            while( !st.isEmpty() && arr[st.peek()]>= arr[i] ){
39                st.pop();
40            }
41
42            res[i] = st.isEmpty() ? n : st.peek() ;
43
44            st.push( i );
45        }
46        return res ;
47    }
48
49    public int[] psefunc( int[] arr ){
50        int n = arr.length ;
51
52        Stack<Integer> st = new Stack<>();
53        int res[] = new int[n];
54        for( int i =0 ; i<n ; i++){
55
56            while( !st.isEmpty() && arr[st.peek()]>= arr[i] ){
57                st.pop();
58            }
59
60            res[i] = st.isEmpty() ? -1 : st.peek() ;
61
62            st.push( i );
63        }
64        return res ;
65    }
66}