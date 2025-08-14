// Last updated: 14/8/2025, 4:26:58 pm
class Solution {
    public int numberOfBeams(String[] bank) { 
        int sum=0, prev=0;
        for( int i=0; i<bank.length; i++){
            int f=0;
            for( int j=0; j<bank[0].length() ; j++){
                if( bank[i].charAt(j)=='1'){
                    f++;
                }
            }
            if(f>0){
                sum+=prev*f;
                prev=f;
            }
        }
        return sum;
    }
}