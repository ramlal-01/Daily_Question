// Last updated: 12/10/2026, 3:03:36 pm
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer,Integer> res = new HashMap<>();
4
5        for(int i =0 ;i<arr.length;i++){
6            if( !res.containsKey(arr[i])){
7                res.put(arr[i],1);
8            }
9            else{
10                res.put(arr[i],res.get(arr[i])+1);
11            }
12        }
13        Set<Integer> a = new HashSet<>();
14        for( Integer num: res.values()){
15            a.add(num);
16        }
17
18        if( res.size()==a.size()){
19            return true;
20        }
21        return false;
22    }
23}