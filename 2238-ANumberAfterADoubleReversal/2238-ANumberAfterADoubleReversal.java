// Last updated: 14/8/2025, 4:26:59 pm
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        if( num%10==0){
            return false;
        }
        return true;
    }
}