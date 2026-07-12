// Last updated: 12/7/2026, 11:31:58 am
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int temp[]= new int[arr.length];
4        for(int i=0;i<arr.length;i++){
5            temp[i]=arr[i];
6        }
7        Arrays.sort(temp);
8        
9        HashMap<Integer,Integer> res = new HashMap<>();
10        int rank =1;
11        for(int i=0;i<arr.length;i++){
12            if(!res.containsKey(temp[i])){
13                res.put(temp[i],rank);
14                rank++;
15            }
16        }
17        
18        for(int i=0;i<arr.length;i++){
19            arr[i]=res.get(arr[i]);
20        }
21        return arr;
22    }
23}