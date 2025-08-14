// Last updated: 14/8/2025, 4:28:23 pm
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> res = new HashSet<>();
        for(int i=0; i<matches.length; i++){
            res.add(matches[i][0]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<matches.length; i++){
            map.put( matches[i][1], map.getOrDefault(matches[i][1],0)+1);
        }
        ArrayList<Integer> nev = new ArrayList<>();
        for( int ele: res){
            if(!map.containsKey(ele)){
                nev.add(ele);
            }
        }

        ArrayList<Integer> one = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            if(ele.getValue()==1){
                one.add(ele.getKey());
            }
        }
        Collections.sort(nev);
        Collections.sort(one);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(nev);
        ans.add(one);
        return ans;
    }
}