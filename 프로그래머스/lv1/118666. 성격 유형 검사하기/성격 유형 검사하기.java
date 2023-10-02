import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < survey.length; i++) {
            String[] split = survey[i].split("");
            char temp = ' ';
            if(choices[i] > 4) {
                temp = split[1].charAt(0);
                map.put(temp, 
                        map.getOrDefault(temp, 0) + choices[i] - 4);
            } else {
                temp = split[0].charAt(0);
                map.put(temp, 
                        map.getOrDefault(temp, 0) + 4 - choices[i]);
            }
            list.add(temp);
        }
        char[] arr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 8; i += 2 ) {
            if(map.getOrDefault(arr[i], 0) < map.getOrDefault(arr[i+1], 0)) {
                sb.append(arr[i+1]);
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString(); 
    }
}