import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(n % divisor == 0) list.add(n);
        }
        if(list.isEmpty()) return new int[]{-1};
        list.sort(null);
        int[] answer = new int[list.size()];
        int i = 0;
        for(int n : list){
            answer[i++] = n;
        }
        return answer;
    }
}