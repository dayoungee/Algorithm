import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : terms) {
            String[] arr = s.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }

        int day = getDate(today.split("\\."));
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            String[] date = arr[0].split("\\.");
            if(getDate(date) + map.get(arr[1]) * 28 <= day) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(integer -> integer).toArray();
    }
    
    public int getDate(String[] date) {
        int year = Integer.parseInt(date[0]) * 12 * 28;
        int m = Integer.parseInt(date[1]) * 28;
        int d = Integer.parseInt(date[2]);
        return year + m + d;
    }
}