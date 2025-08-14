// Last updated: 14/8/2025, 4:28:11 pm
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int max=0;
        for( int ele : candies){
            max=Math.max(max,ele);
        }
        for( int ele: candies){
            if( ele+extraCandies >= max){
                res.add(true);
            }
            else res.add(false);
        }
        return res;
    }
}