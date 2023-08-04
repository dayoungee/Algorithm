import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : phone_book) map.put(s, 0);
        
        for(String str : phone_book){
            for(int j = 0; j < str.length(); j++){
                if(map.containsKey(str.substring(0,j))) return false;
            }
        }
        
        return true;
    }
}