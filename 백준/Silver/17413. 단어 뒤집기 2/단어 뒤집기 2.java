
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack stack = new Stack<>();
        String str = br.readLine();

        boolean tagFlag = false;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == ' ' && !tagFlag){
                while(!stack.isEmpty()) sb.append(stack.pop());
                sb.append(c);
            }
            else if(!tagFlag && c != '<' && c != '>')
                stack.push(c);

            if(c == '<'){
                tagFlag = true;
                while(!stack.isEmpty()) sb.append(stack.pop());
            }
            if( tagFlag ) sb.append(c);
            if(c == '>'){
                tagFlag = false;
            }
        }

        while(!stack.isEmpty()) sb.append(stack.pop());
        System.out.print(sb);
    }
}