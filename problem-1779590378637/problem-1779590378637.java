// Last updated: 24/5/2026, 8:09:38 am
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        int n = nums.length ;
4
5        Map<Integer,Integer> map = new HashMap<>() ;
6        for( int ele : nums ){
7            map.put( ele , map.getOrDefault(ele,0)+1 );
8        }
9
10        ArrayList<Integer> list = new ArrayList<>() ;
11
12        for( int ele : nums ){
13            if( map.get(ele)>0) {
14                list.add(ele);
15                map.put(ele , map.get(ele)-1);
16
17                if( map.get(ele) < (n+1) ){
18                    int a = 0 ;
19                    for( int x : list ){
20                        if( x==ele){
21                            a++;
22                        }
23                    }
24
25                    if( a > k ){
26                        list.remove(list.size()-1);
27                    }
28                }
29
30            }
31            
32        }
33        int[] arr = new int[list.size()];
34        for( int i = 0 ; i<list.size() ; i++ ){
35            arr[i] = list.get(i) ;
36        }
37        return arr ;
38    }
39}