// Last updated: 14/8/2025, 4:27:12 pm
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for( int i=0; i<operations.length; i++){
            
                if( operations[i].charAt(1)=='+'){
                    sum++;
                }
                else{
                    sum--;
                }
            
        }
        return sum;
    }
}