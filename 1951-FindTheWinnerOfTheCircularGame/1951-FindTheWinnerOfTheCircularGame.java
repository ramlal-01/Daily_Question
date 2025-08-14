// Last updated: 14/8/2025, 4:27:29 pm
class Solution {
    public int findTheWinner(int n, int k) {
        int c= solve(n,k);
        return c+1;
    }
    public int solve(int n, int k){
        if( n==0){
            return 1;
        }
        return (solve(n-1,k)+k)%n;
    }
}