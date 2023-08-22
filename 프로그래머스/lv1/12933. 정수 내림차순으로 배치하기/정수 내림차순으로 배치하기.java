import java.util.*;

class Solution {
    public long solution(long n) {
        String str = "" + n;
        Integer[] answer = new Integer[str.length()];
        int i = 0;
        for(char c : str.toCharArray()){
            answer[i++] = c - '0';
        }
        Arrays.sort(answer, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int num : answer){
            sb.append(num);
        }
        return Long.parseLong(sb.toString());
    }
}