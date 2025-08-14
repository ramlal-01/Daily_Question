// Last updated: 14/8/2025, 4:25:32 pm
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> map= new ArrayList<>();
      
        for( int i=0; i<nums.length ; i++){
            if(x==nums[i]){
                map.add(i);
                
            }
        }
        

        
        int res[] = new int[queries.length];
        
        for(int i=0; i<queries.length ; i++){
            if( queries[i]<= map.size()){
                res[i]= map.get(queries[i]-1);
            }
            else{
                res[i]=-1;
            }
        }
        
        return res;
        }
}