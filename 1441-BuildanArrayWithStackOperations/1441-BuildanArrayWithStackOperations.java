// Last updated: 8/1/2026, 12:04:29 pm
1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        Set<Integer> set = new HashSet<>();
4        int max = 0 ;
5        for( int ele : target) {
6            set.add(ele);
7            max = Math.max(ele,max);
8        }
9
10        List<String> list = new ArrayList<>();
11
12        for( int i=1 ; i<=max ; i++ ){
13            if( set.contains(i)){
14                list.add("Push");
15            }
16            else{
17                list.add("Push");
18                list.add("Pop");
19            }
20        }
21        return list;
22    }
23}