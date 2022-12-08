import java.io.*;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Main T = new Main();
        while(true){
            String str = br.readLine();
            if(str.equals("."))     break;
            else System.out.println(T.solution(str.toCharArray()));
        }
    }

    public String solution(char[] arr) {
        Stack<Character> stack = new Stack<>();

        for(char x : arr){
            if(x=='(' || x =='[')   stack.push(x);
            else if(x==')') {
                if (stack.isEmpty() || stack.peek() != '(')     return "no";
                else                                            stack.pop();
            }
            else if(x==']') {
                if (stack.isEmpty() || stack.peek() != '[')     return "no";
                else                                            stack.pop();
            }
        }

        if(!stack.isEmpty())        return "no";

        return "yes";
    }

}