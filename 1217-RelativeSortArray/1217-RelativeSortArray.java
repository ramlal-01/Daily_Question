// Last updated: 14/8/2025, 4:28:41 pm
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int ele : arr1){
            if(!map.containsKey(ele)){
                map.put(ele, 1);
            }
            else{
                map.put(ele, map.get(ele)+1);
            }
        }
        int a=0;
        int res[] = new int[arr1.length];
        for( int i=0; i<arr2.length; i++){
            int x= map.get(arr2[i]);
            
            for(int j=0; j<x ; j++){
                res[a]=arr2[i];
                a++;
            }
            map.remove(arr2[i]);
        }
        

        List<Integer> rem = new ArrayList<>();
        for (int key : map.keySet()) {
            int count = map.get(key);
            for (int j = 0; j < count; j++) {
                rem.add(key);
            }
        }
        Collections.sort(rem);
        for(int ele: rem){
            res[a]=ele;
            a++;
        }
        return res;
    }
}