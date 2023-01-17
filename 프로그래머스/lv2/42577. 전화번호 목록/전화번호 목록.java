import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        
        int i = 0;
        for(String s : phone_book) map.put(s, i++);
        
        for(String str : phone_book){
            for(int j = 0; j < str.length(); j++){
                if(map.containsKey(str.substring(0,j))) return false;
            }
        }
        
        return answer;
    }
}