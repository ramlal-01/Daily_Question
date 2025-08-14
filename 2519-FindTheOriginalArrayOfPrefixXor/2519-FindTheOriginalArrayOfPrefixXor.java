// Last updated: 14/8/2025, 4:26:29 pm
class Solution {
    public int[] findArray(int[] pref) {
        for( int i = pref.length - 1 ; i > 0 ; i--){
            pref[i] = pref[i] ^ pref[i-1];
        }
    return pref;
    }
}