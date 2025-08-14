// Last updated: 14/8/2025, 4:27:42 pm
class Solution {
    public boolean checkPowersOfThree(int n) {
        while( n>0){
            int rem = n%3;
            if( rem!=0 && rem!=1){
                return false;
            }
            n=n/3;
        }
        return true;
    }
}