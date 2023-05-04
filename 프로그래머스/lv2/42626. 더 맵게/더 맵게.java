import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int n : scoville) q.add(n);
        int answer = 0;
        while(q.peek() < K){
            if(q.size() == 1) return -1;
            q.add(q.poll() + q.poll() * 2);
            answer++;
        }
        return answer;
    }
}