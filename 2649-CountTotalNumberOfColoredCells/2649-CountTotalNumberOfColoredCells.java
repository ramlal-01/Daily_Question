// Last updated: 14/8/2025, 4:26:06 pm
class Solution {
    public long coloredCells(int n) {
        long sum=1;
        int k=0;
        for( int i=1;i<=n;i++){
            sum+= k;
            k+=4;
        }
        return sum;
    }
}