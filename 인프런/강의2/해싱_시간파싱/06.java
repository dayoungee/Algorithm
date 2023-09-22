import java.util.*;
class Solution {
    public String[] solution(String[] reports, String times){
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String s : reports) {
            String[] str = s.split(" ");
            map.put(str[0], Integer.parseInt(str[1].replace(":", "")));
            list.add(str[0]);
        }
        list.sort((o1, o2) -> map.get(o1) - map.get(o2));
        List<String> answer = new ArrayList<>();
        String[] time = times.split(" ");
        int start = Integer.parseInt(time[0].replace(":", ""));
        int end = Integer.parseInt(time[1].replace(":", ""));
        for(String s : list) {
            if(map.get(s) >= start && map.get(s) <= end) {
                answer.add(s);
            }
        }

        return answer.toArray(new String[answer.size()]);
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
        System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
    }
}