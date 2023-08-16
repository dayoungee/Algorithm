import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length - 1; i++){
            int len = citations.length - i;
            if(citations[i] >= len) return len;
        }
        return 0;
    }
}