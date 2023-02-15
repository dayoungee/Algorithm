import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n --> 0){
            sb.append(getAnswer(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }

    public static int getAnswer(String str){
        int answer = 0, num = 0;
        char preChar = 'X';
        for(int i = 0; i<str.length(); i++){
            char score = str.charAt(i);
            if(preChar == score && preChar == 'O') num++;
            else if(score == 'O') num++;
            else                  num = 0;
            preChar = score;
            answer += num;

        }
        return answer;
    }

}
