// Last updated: 14/8/2025, 4:26:09 pm
class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> res = new ArrayList<>();

        while(n>0){
            int rem = n%10;
            res.add(rem);
            n=n/10;
        }
        Collections.reverse(res);
        int s=0;
        for( int i =0; i<res.size();i++){
            if( i%2!=0){
                s-=res.get(i);
            }
            else{
                s+=res.get(i);
            }
        }
        return s;
    }
}