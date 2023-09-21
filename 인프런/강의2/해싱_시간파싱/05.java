import java.util.*;
class Solution {
    public String solution(String[] votes, int k){
        String answer = " ";
        Map<String, Integer> map = new HashMap<>();
        for(String s: votes) {
            String[] arr = s.split(" ");
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= k ) {
                list.add(entry.getKey());
            }
        }
        map.clear();
        for(String s : votes) {
            String[] arr = s.split(" ");
            for(String l : list) {
                if(arr[1].equals(l)) {
                    map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
                    break;
                }
            }
        }

        list.clear();

        for(String s : map.keySet()) {
            list.add(s);
        }

        list.sort((o1, o2) -> {
            if(map.get(o2) == map.get(o1)) {
                return o1.compareTo(o2);
            }
            return map.get(o2) - map.get(o1);
        });

        return list.get(0);
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }
}