import java.util.*;


class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < words.length; i++){
            String start = "";
            String end = "";
            if(i != 0){
                end = words[i-1].substring(words[i-1].length() - 1, words[i-1].length());
                start = words[i].substring(0, 1);
            }
            if(set.contains(words[i]) || !start.equals(end)) { 
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            set.add(words[i]);
        }

        return new int[]{0, 0};
    }
}