import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            queue.offer(progresses[i]);
        }
        int progressesIdx = 0;
        while(!queue.isEmpty()){
            for(int i = progressesIdx; i < progresses.length; i++){
                queue.offer(queue.poll() + speeds[i]);
            }
            int cnt = 0;
            while(!queue.isEmpty() && queue.peek()>= 100){
                queue.poll();
                progressesIdx++;
                cnt++;
            }
            if(cnt > 0){
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[answer.length-1] = cnt;
            }
        }
        return answer;
    }
}