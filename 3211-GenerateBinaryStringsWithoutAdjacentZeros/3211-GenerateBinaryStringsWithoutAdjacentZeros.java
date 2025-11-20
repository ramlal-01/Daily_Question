// Last updated: 20/11/2025, 2:07:38 pm
class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();

        String arr[] = {"0" , "1"};

        StringBuilder sb = new StringBuilder();

        helper( n , res , arr , sb );
        return res ;
    }

    public void helper( int n , List<String> res , String arr[] , StringBuilder sb ){

        if( n==0 ){
            res.add( sb.toString());
            return ;
        }

        if( sb.length()==0){

            sb.append(arr[0] );
            helper( n-1 , res , arr , sb);
            sb.deleteCharAt(sb.length()-1);
            
            sb.append((arr[1] ));
            helper( n-1 , res , arr , sb);
            sb.deleteCharAt(sb.length()-1);
        }

        else if( sb.charAt(sb.length()-1) == '0'){

            sb.append(arr[1] );
            helper( n-1 , res , arr , sb);
            sb.deleteCharAt(sb.length()-1);
        
        }

        else{

            sb.append( arr[0] );
            helper( n-1 , res , arr , sb);
            sb.deleteCharAt(sb.length()-1);

            sb.append(arr[1]);
            helper( n-1 , res , arr , sb);
            sb.deleteCharAt(sb.length() -1);
        }

    }
}