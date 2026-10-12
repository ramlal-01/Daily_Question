// Last updated: 12/10/2026, 11:18:16 am
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        ArrayList<Boolean> res = new ArrayList<>();
4        int max=0;
5        for( int ele : candies){
6            max=Math.max(max,ele);
7        }
8        for( int ele: candies){
9            if( ele+extraCandies >= max){
10                res.add(true);
11            }
12            else res.add(false);
13        }
14        return res;
15    }
16}