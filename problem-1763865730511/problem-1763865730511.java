// Last updated: 23/11/2025, 8:12:10 am
class Solution {
    public long sumAndMultiply(int n) {

        int a = n ;
        long sum = 0 ;
        StringBuilder sb = new StringBuilder();
        while( a>0){
            int rem = a%10 ;

            if( rem!=0 ){
                sum+= rem ;
                sb.append(rem);
            }
            a = a/10;
        }
        
        sb.reverse();
        
        int x = sb.length()==0? 0 : Integer.parseInt(sb.toString());

        return sum* (long)(x);
    }
}