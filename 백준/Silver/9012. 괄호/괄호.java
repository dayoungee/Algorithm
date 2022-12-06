import java.io.*;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Main T = new Main();
        for(int i = 0; i < n; i++) {
            String str = in.next();
            System.out.println(T.solution(str.toCharArray()));
        }
    }

    public String solution(char[] arr) {
        Stack<Character> stack = new Stack<Character>();
        for(char x : arr){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }

}