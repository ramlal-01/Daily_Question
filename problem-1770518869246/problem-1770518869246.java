// Last updated: 8/2/2026, 8:17:49 am
1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3        Stack<Long> st = new Stack<>() ;
4        int n = nums.length; 
5        for( int i=0 ; i<n ; i++ ){
6            long ele = nums[i];
7            while( !st.isEmpty() && st.peek()==ele ){
8                ele+= st.pop();
9            }
10            st.push(ele );
11        }
12
13        List<Long> list = new ArrayList<>();
14
15        while(!st.isEmpty() ){
16            list.add(st.pop());
17        }
18
19        Collections.reverse(list);
20        return list ;
21    }
22}