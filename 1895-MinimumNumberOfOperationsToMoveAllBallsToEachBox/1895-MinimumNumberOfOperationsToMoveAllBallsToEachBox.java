// Last updated: 14/8/2025, 4:27:40 pm
class Solution {
    public int[] minOperations(String boxes) {
        int arr[]=  new int[boxes.length()];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<boxes.length(); i++){
            if( boxes.charAt(i)-'0' !=0 ){
                res.add(i);
            }
        }

        for( int i=0; i<arr.length; i++){
            int sum=0;
            for( int ele: res){
                sum+= Math.abs( i- ele);
            }
            arr[i]=sum;
        }
        return arr;
    }
}