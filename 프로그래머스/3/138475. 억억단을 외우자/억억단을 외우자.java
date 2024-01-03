import java.util.*;

class Solution {
    public int[] solution(int e, int[] starts) {
     
        int[] answer = new int[starts.length];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= i; j++) {
                long value = i * j;
                if (e < value)
                    break;
                if (i == j) {
                    map.put(i * j, map.getOrDefault(i * j, 0) + 1);
                } else {
                    map.put(i * j, map.getOrDefault(i * j, 0) + 2);
                }
            }
        }

        List<int[]> list = new ArrayList<>();
        for (int key : map.keySet()) {
            list.add(new int[] { key, map.get(key) });
        }
        
        list.sort((o1, o2) -> {
            if(o1[1] == o2[1]) return o1[0] - o2[0];
            
            return o2[1] - o1[1];
        });


        for (int i = 0; i < starts.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (starts[i] <= list.get(j)[0]) {
                    answer[i] = list.get(j)[0];
                    break;
                }
            }
        }

        return answer;
    }
}