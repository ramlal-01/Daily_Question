// Last updated: 14/8/2025, 4:25:17 pm
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int map[]= new int[nums.length+1];
        for(int ele:nums){
            map[ele]++;
        }
        int res[]= new int[2];
        int x=0;
        for( int i=1; i<map.length ;i++){
            if(map[i]==2){
                res[x++]=i;
            }
        }
        return res;
    }
}