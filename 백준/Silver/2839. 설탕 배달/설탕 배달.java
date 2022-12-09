import java.io.*;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        Main T = new Main();

        System.out.println(T.solution(n));


    }

    public int solution(int n) {
        int answer = 0;

        while(true){
            if(n%5 == 0) return n/5 + answer;
            else if(n < 0){
                return -1;
            }
            n = n - 3;
            answer ++;
        }

    }


}