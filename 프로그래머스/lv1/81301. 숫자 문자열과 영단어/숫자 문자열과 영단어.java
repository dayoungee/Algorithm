import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
            }else{
                answer.append(c);
            }
            if(map.get(sb.toString()) != null){
                answer.append(map.get(sb.toString()));
                sb.setLength(0);
            }
            
        }
       
        return Integer.parseInt(answer.toString());
        
    }
    
}