// Last updated: 14/8/2025, 4:28:35 pm
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> res = new HashMap<>();
        int rank =1;
        for(int i=0;i<arr.length;i++){
            if(!res.containsKey(temp[i])){
                res.put(temp[i],rank);
                rank++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=res.get(arr[i]);
        }
        return arr;
    }
}