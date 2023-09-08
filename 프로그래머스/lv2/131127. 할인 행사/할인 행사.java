import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - 10 + 1; i++){
            Map<String, Integer> dMap = new HashMap<>();
            for(int j = 0; j < 10; j++){
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }
            
            boolean isSame = false;
            
            for(String s : map.keySet()){
                if(map.get(s) != dMap.get(s)){
                    isSame = true;
                    break;
                }
            }
            answer += isSame ? 0 : 1;
        }
        return answer;
    }
}