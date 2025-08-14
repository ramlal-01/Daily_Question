// Last updated: 14/8/2025, 4:25:57 pm
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int map[]= new int[A.length+1];
        int res[]= new int[A.length];
        int f=0;
        for( int i=0 ; i<A.length ; i++){
           
            if( ++map[A[i]]>=2) f++;
            if( ++map[B[i]]>=2) f++;
            res[i]=f;
        }
        return res;
    }
}