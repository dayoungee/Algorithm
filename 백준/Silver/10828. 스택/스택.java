

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String control = st.nextToken();

            if(control.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if(control.equals("top")){
                if(!stack.isEmpty()) sb.append(stack.peek()).append("\n");
                else                 sb.append("-1\n");
            }
            else if(control.equals("pop")){
                if(!stack.isEmpty()) sb.append(stack.pop()).append("\n");
                else                 sb.append("-1\n");
            }
            else if(control.equals("size")){
                sb.append(stack.size()).append("\n");
            }
            else if(control.equals("empty")){
                if(!stack.isEmpty()) sb.append("0\n");
                else                 sb.append("1\n");
            }
        }
        
        System.out.print(sb);

    }

}