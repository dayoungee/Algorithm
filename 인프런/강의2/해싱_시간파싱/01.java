import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s){
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char c = ' ';
        for(Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue() == 1) {
                c = m.getKey();
                break;
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(c == s.charAt(i)) return i+1;
        }

        return - 1;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}