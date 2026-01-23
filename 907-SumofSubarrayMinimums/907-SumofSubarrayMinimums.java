// Last updated: 23/1/2026, 8:17:41 am
1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n = arr.length;
4        int[] nse = nsefunc(arr);
5        int[] pse = psefunc(arr);
6        int mod = 1_000_000_007;
7        long sum = 0;
8
9        for (int i = 0; i < n; i++) {
10            long a = nse[i] - i;
11            long b = i - pse[i];
12            sum = (sum + (long) arr[i] * a * b % mod) % mod;
13        }
14        
15        return (int) sum;
16    }
17
18    public int[] nsefunc( int[] arr ){
19        int n = arr.length ;
20
21        Stack<Integer> st = new Stack<>();
22        int res[] = new int[n];
23        for( int i =n-1 ; i>=0 ; i--){
24
25            while( !st.isEmpty() && arr[st.peek()]> arr[i] ){
26                st.pop();
27            }
28
29            res[i] = st.isEmpty() ? n : st.peek() ;
30
31            st.push( i );
32        }
33        return res ;
34    }
35
36    public int[] psefunc( int[] arr ){
37        int n = arr.length ;
38
39        Stack<Integer> st = new Stack<>();
40        int res[] = new int[n];
41        for( int i =0 ; i<n ; i++){
42
43            while( !st.isEmpty() && arr[st.peek()]>= arr[i] ){
44                st.pop();
45            }
46
47            res[i] = st.isEmpty() ? -1 : st.peek() ;
48
49            st.push( i );
50        }
51        return res ;
52    }
53}