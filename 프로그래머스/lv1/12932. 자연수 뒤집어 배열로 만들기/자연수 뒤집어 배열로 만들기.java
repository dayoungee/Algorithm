import java.util.*;

class Solution {
    public int[] solution(long n) {
        int len = (int)Math.log10(n) + 1;
        int[] answer = new int[len];
        String str = String.valueOf(n);
        for(char c : str.toCharArray()){
            answer[--len] = (int)c - '0';
        }        
        return answer;
    }
}