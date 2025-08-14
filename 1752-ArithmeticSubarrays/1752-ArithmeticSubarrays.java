// Last updated: 14/8/2025, 4:27:57 pm
import java.util.*;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        int m = l.length;

        for (int i = 0; i < m; i++) { 
            int[] subarr = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(subarr);  
            boolean isArithmetic = true;
            int diff = subarr[1] - subarr[0];

            for (int j = 1; j < subarr.length - 1; j++) {
                if (subarr[j + 1] - subarr[j] != diff) {
                    isArithmetic = false;
                    break;
                }
            }
            res.add(isArithmetic);
        }
        return res;
    }
}
