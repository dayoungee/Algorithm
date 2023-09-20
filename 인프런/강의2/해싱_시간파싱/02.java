import java.util.*;
class Solution {
    public int[] solution(String s){
        int[] answer = new int[5];
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            max = Math.max(map.get(c), max);
        }
        int idx = 0;
        for(int n : map.values()) {
            answer[idx++] = max - n;
        }

        while(idx < 5) {
            answer[idx++] = max;
        }

        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }
}
