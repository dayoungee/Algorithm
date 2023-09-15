import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) map.put(name[i], yearning[i]);
        int index = 0;
        for(String[] arr : photo) {
            int score = 0;
            for(String s : arr) {
                if(map.containsKey(s)){
                    score += map.get(s);
                }
            }
            answer[index++] = score;
        }
        
        return answer;
    }
}