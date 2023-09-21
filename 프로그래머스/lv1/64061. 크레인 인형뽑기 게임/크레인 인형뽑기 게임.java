import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int n : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][n-1] != 0) {
                    stack.push(board[i][n-1]);
                    board[i][n-1] = 0;
                    break;
                }
            }
            if(stack.isEmpty()) continue;
        
            int top = stack.pop();
            System.out.println(n);
            if(!stack.isEmpty() && stack.peek() == top) {
                answer += 2;
                stack.pop();
            } else stack.push(top);
        }
     
       
        return answer;
    }
    

}