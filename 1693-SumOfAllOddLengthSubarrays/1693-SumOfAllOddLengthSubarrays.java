// Last updated: 14/8/2025, 4:27:59 pm
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        System.out.print( prefix[0]+" ");
        for( int i=1; i<arr.length ; i++){
            prefix[i] = prefix[i-1]+ arr[i];
            // System.out.print( prefix[i]+" ");
        }
        // System.out.println();
        int sum=0;
        for( int i=0; i<arr.length; i++){
            for( int j=0; j<arr.length ; j++){
                if( (j-i+1)%2!=0 && i<=j){
                    sum+= i==0? prefix[j] : prefix[j]- prefix[i-1];
                    // System.out.println( sum+" "+"i->"+i+"j->"+j+" ");
                }
                 
            }
        }
        return sum;
    }
    
}