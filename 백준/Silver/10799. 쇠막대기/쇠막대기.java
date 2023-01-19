import java.io.*;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner(System.in);
       // String str = in.nextLine();
        String str = br.readLine();
        Main T = new Main();
        T.solution(str.toCharArray());

    }

    public void solution(char[] arr) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char lt = '(';
        for(char c : arr){
            if(c == '(') stack.push(c);
            else{
                stack.pop();
                if(lt =='(')
                    answer +=stack.size();
                else
                    answer++;
            }
            lt = c;
        }
        System.out.println(answer);
    }

}