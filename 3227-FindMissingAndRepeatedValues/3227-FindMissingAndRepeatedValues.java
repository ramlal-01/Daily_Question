// Last updated: 14/8/2025, 4:25:43 pm
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length; // Grid is n x n
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        int[] res = new int[2]; 
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                res[0] = entry.getKey();
                break;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (!map.containsKey(i)) {
                res[1] = i;
                break;
            }
        }
        
        return res;
    }
}