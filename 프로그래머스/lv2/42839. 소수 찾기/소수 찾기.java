import java.util.*;

class Solution {
    boolean[] check = new boolean[10000000];
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        setPrime();
        combination(numbers, "", set);
        for(Integer n : set){
            if(!check[n] && n > 1) answer++;
        }
        return answer;
    }
    public void combination(String numbers, String str, Set<Integer> set){
        int len = numbers.length();
        if (!"".equals(str)) {
            set.add(Integer.valueOf(str));
        }
        for (int i = 0; i < len; i++) {
            combination(numbers.substring(0, i) + numbers.substring(i + 1, len), str + numbers.charAt(i), set);
        }
    }
    public void setPrime(){
        for(int i = 2; i <= Math.sqrt(check.length); i++){
            if(!check[i]){
                for(int j = i * i; j <= check.length -1; j += i) check[j] = true;
            }
        }
    }
    
}