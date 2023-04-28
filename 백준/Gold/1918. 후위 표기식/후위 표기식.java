
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            switch (c){
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    while(!stack.isEmpty() && stack.peek() != '(') sb.append(stack.pop());
                    stack.pop();
                    break;
                case '*':
                case '/':
                case '+':
                case '-':
                    /* while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) sb.append(stack.pop());
                    */
                    while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(c)) sb.append(stack.pop());
                    
                    stack.push(c);
                    break;
                default:
                    sb.append(c);
            }
        }

        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
    }

    public static int getPriority(char c){
        switch (c){
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
}
