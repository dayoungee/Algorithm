
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        char[] stick = br.readLine().toCharArray();
        Stack stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < stick.length; i++){
            char c = stick[i];
            if(c == '(') stack.push(c);
            if(c == ')'){
                if(i>0 && stick[i-1] == '('){
                    stack.pop();
                    answer += stack.size();
                }
                else{
                    stack.pop();
                    answer++;
                }
            }
        }

        System.out.print(answer);
    }
}