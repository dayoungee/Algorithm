import java.util.ArrayList;
import java.util.List;
class Solution {
    static String[] arr;
    static List<String> list;
    public int solution(String word) {
        int answer = 0;
        
        list = new ArrayList<>();
        arr = new String[]{"A", "E", "I", "O", "U"};
        // 완전탐색 메서드 호출
        recursion("", 0);
        
        return list.indexOf(word);
    }
    
    // 완전탐색 메서드
    static void recursion( String str, int depth) {
        list.add(str);
        
        if(depth == 5) {
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            recursion(str + arr[i], depth + 1);
        }
    }
}