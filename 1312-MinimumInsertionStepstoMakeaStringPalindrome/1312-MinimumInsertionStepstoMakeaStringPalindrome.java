// Last updated: 23/1/2026, 7:23:23 am
1class Solution {
2    public int maxSumMinProduct(int[] nums) {
3        int mod = (int)1e9+7 ;
4
5        int n = nums.length ;
6        int[] nse = nsefunc(nums);
7        int[] pse = psefunc(nums);
8
9        long sum = 0 ;
10        for( int ele : nums) sum+=ele;
11         
12        long pref[] = new long[n];
13        pref[0] = nums[0];
14        for ( int i =1 ; i<n ;i++){
15            pref[i] = pref[i-1]+nums[i] ;
16        }
17
18        long max = Long.MIN_VALUE ;
19        for( int i =0 ; i<n ; i++){
20            int x = pse[i] ;
21            int y = nse[i] ;
22
23            long psum = x==-1 ? 0 : pref[x];
24
25            long nsum= pref[y-1] ;
26
27            long diff = nsum-psum;
28            max = Math.max( max , diff*nums[i] );
29        }
30        return (int)(max%mod );
31
32    }
33
34    public int[] nsefunc( int[] arr ){
35        int n = arr.length ;
36
37        Stack<Integer> st = new Stack<>();
38        int res[] = new int[n];
39        for( int i =n-1 ; i>=0 ; i--){
40
41            while( !st.isEmpty() && arr[st.peek()]>= arr[i] ){
42                st.pop();
43            }
44
45            res[i] = st.isEmpty() ? n : st.peek() ;
46
47            st.push( i );
48        }
49        return res ;
50    }
51
52    public int[] psefunc( int[] arr ){
53        int n = arr.length ;
54
55        Stack<Integer> st = new Stack<>();
56        int res[] = new int[n];
57        for( int i =0 ; i<n ; i++){
58
59            while( !st.isEmpty() && arr[st.peek()]>= arr[i] ){
60                st.pop();
61            }
62
63            res[i] = st.isEmpty() ? -1 : st.peek() ;
64
65            st.push( i );
66        }
67        return res ;
68    }
69}