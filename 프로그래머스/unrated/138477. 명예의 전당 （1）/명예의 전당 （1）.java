import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        int idx = 0;
        for(int n : score) {
            list.add(n);
            list.sort(Collections.reverseOrder());
            if(list.size() == k + 1) list.remove(k);
            answer[idx++] = list.get(list.size()-1);
        }
        return answer;
    }
}