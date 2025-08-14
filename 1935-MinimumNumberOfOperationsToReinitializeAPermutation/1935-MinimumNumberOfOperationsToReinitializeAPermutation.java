// Last updated: 14/8/2025, 4:27:35 pm
import java.util.Arrays;

class Solution {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            perm[i] = i;
        }

        int k = 0;
        int[] original = Arrays.copyOf(perm, n); 
        while (true) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = perm[i / 2];
                } else {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                }
            }

            k++;
            if (Arrays.equals(original, arr)) {
                break;
            }
            System.arraycopy(arr, 0, perm, 0, n);
        }
        return k;
    }
}
