import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : tangerine) {
            map.put(n, map.getOrDefault(n , 0) + 1);
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2) - map.get(o1));
        int i = 0;
        int m = keySet.get(0);
        for(int n : keySet) {
            i += map.get(n);
            if(n != m) {
                answer++;
            }
            m = n;
            if(i >= k) break;
        }
        return answer;
    }
}