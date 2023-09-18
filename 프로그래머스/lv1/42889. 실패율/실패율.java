import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCnt = new int[N+1];
        for(int i = 0; i < stages.length; i++) {
            if(stages[i] > N) continue;
            stageCnt[stages[i]]++;
        }
        
        Map<Integer, Double> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
    
        int user = stages.length;
        for(int i = 1; i <= N; i++) {
            map.put(i, stageCnt[i] == 0 ? 0 : (double)stageCnt[i] / user);
            System.out.println((double)stageCnt[i] / user + " " + i + " " + stageCnt[i] + " " + user);
            user -= stageCnt[i];
            list.add(i);
        }
        list.sort((o1, o2) ->
           Double.compare(map.get(o2), map.get(o1))
        );
        int i = 0;
        for(int idx : list) {
            answer[i++] = idx;
        }
        return answer;
    }
}