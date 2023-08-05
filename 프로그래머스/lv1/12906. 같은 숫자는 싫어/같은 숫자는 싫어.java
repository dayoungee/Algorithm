import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int n : arr){
            if(!stack.isEmpty() && stack.peek() == n){
                stack.pop();
            }
            stack.push(n);
        }
        int[] answer = new int[stack.size()];
        
        int i = stack.size();
        while(!stack.isEmpty()){
            answer[--i] = stack.pop();
        }
        return answer;
    }
}