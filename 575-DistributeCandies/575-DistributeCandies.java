// Last updated: 14/1/2026, 12:31:39 pm
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        int n=candyType.length;
4        HashSet<Integer> hs= new HashSet<>();
5        for(int x:candyType){
6            hs.add(x);
7        }
8        int min=Math.min(hs.size(),n/2);
9        return min;
10    }
11}