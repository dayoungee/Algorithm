import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < str.length();i++){
            stackL.push(str.charAt(i));
        }
        for (int i=0; i<n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch(c){
                case 'L':
                    if(!stackL.isEmpty()) stackR.push(stackL.pop());

                    break;
                case 'D':
                    if(!stackR.isEmpty()) stackL.push(stackR.pop());

                    break;
                case 'B':
                    if(!stackL.isEmpty()) stackL.pop();
                    break;
                case 'P':
                    stackL.push(command.charAt(2));
                    break;
            }
        }

        while (!stackL.isEmpty()) stackR.push(stackL.pop());

        while (!stackR.isEmpty()) sb.append(stackR.pop());

        System.out.print(sb);
    }
}
