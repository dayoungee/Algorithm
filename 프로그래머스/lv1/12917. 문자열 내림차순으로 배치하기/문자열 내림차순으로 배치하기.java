import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        
        for(String str : arr){
            sb.append(str);
        }
            
        System.out.println(sb.toString());
        return sb.reverse().toString();
    }
}