// Last updated: 7/10/2025, 10:48:40 am
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char[] arr = s.toCharArray();

        for( int i = 0 ; i<arr.length; i++){
            if( arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));
    }
}