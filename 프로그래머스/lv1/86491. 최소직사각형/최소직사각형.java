import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        for (int[] a : sizes) Arrays.sort(a);
        
        int maxW = 0;
        int maxL = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            maxW = Math.max(maxW, sizes[i][0]);
            maxL = Math.max(maxL, sizes[i][1]);
        }
        
        return maxL * maxW;
    }
}