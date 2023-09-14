import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        int index = 0;
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                answer[index] = index - map.get(c);
            } else {    // 없을 경우
                answer[index] = -1; 
            }
             map.put(c, index);
            index++;
        }
        return answer;
    }
}