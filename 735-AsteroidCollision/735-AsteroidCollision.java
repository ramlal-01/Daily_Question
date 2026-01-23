// Last updated: 23/1/2026, 7:48:16 am
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st = new Stack<>();
4        int n = asteroids.length;
5
6        for( int i = 0 ; i< n ; i++){
7            if( asteroids[i]>0){
8                st.push(asteroids[i] );
9            }
10            else{
11
12                while( !st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
13                    st.pop();
14                }
15                if( !st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
16                    st.pop();
17                }
18                else if( st.isEmpty() || st.peek()<0){
19                    st.push(asteroids[i]);
20                }
21            }
22        }
23        int res[] = new int[st.size()];
24        for( int i =st.size()-1 ; i>=0 ; i--){
25            res[i]=st.pop();
26        }
27        return res;
28    }
29}