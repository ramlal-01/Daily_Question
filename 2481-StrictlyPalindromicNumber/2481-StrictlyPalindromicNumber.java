// Last updated: 14/8/2025, 4:26:36 pm
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        // System.out.println( bin(9));

        for( int i=2; i<= n-2 ; i++){
            int a = bin( n, i);
            if( a!= bin(n,10)){
                return false;
            }
        }
        return true;
    }

    public int bin( int n , int b){
        int num=0;
        int k=0;
        while( n>0){
            int rem = n%b;
            num+= Math.pow(10,k++)*rem;
            n/=b;
        }
        return num;
    }
}