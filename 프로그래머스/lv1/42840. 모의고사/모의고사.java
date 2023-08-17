import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int[] sccess = {0,0,0};
        
        for(int i = 0; i < answers.length; i++){
            if(a[i%5] == answers[i]) sccess[0]++;
            if(b[i%8] == answers[i]) sccess[1]++;
            if(c[i%10] == answers[i]) sccess[2]++;
        }
        
        int max = Math.max(sccess[0], Math.max(sccess[1], sccess[2]));
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < sccess.length; i++){
            if(sccess[i] == max) list.add(i+1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
     
    }
}