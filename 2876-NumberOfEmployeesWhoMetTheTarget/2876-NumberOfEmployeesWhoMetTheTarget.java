// Last updated: 14/8/2025, 4:25:51 pm
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int f=0;
        for(int ele: hours){
            if(ele>=target){
                f+=1;
            }
        }
        return f;
    }
}