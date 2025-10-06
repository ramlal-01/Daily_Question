// Last updated: 7/10/2025, 5:27:51 am
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper( s , res , new ArrayList<>() );
        return res;
    }

    public void helper( String s ,List<List<String>>res , List<String> path ){
        if( s.length()==0){
            res.add( new ArrayList<>(path));
            return;
        }

        for( int i = 0 ; i<s.length() ; i++){
            String part = s.substring( 0 , i+1);
            if( valid( part )){
                path.add( part);
                helper( s.substring(i+1) , res , path);
                path.remove( path.size()-1);
            }
        }
    }

    public boolean valid( String s){
        int i = 0 ;
        int j = s.length()-1;
        while( i<=j){
            if( s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true ;
    }
}