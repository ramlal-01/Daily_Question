// Last updated: 14/8/2025, 4:28:29 pm
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> res = new HashMap<>();

        for(int i =0 ;i<arr.length;i++){
            if( !res.containsKey(arr[i])){
                res.put(arr[i],1);
            }
            else{
                res.put(arr[i],res.get(arr[i])+1);
            }
        }
        Set<Integer> a = new HashSet<>();
        for( Integer num: res.values()){
            a.add(num);
        }

        if( res.size()==a.size()){
            return true;
        }
        return false;
    }
}