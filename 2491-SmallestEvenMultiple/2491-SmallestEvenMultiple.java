// Last updated: 14/8/2025, 4:26:33 pm
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        return n*2;
    }
}