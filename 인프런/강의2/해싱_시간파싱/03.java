import java.util.*;
class Solution {
    public int solution(String s){
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int cnt : map.values()) {
            while(set.contains(cnt) && cnt != 0 ) {
                cnt--;
                answer++;
            }
            set.add(cnt);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }
}