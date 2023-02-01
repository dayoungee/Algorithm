import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n --> 0){
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            String str = br.readLine();
            for(char c : str.toCharArray()){
                if(c == '(') stack.push(c);
                else{
                    if(stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty() || !flag) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }

        System.out.print(sb);
    }

}
