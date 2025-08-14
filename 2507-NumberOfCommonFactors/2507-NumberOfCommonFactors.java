// Last updated: 14/8/2025, 4:26:31 pm
class Solution {
    public int commonFactors(int a, int b) {
        int x = Math.min(a,b);
        int f=0;
        for( int i=1; i<=x ; i++){
            if( a%i==0 && b%i==0){
                f++;
            }
        }
        return f;
    }
}