

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while((str = br.readLine()) != null){
            int[] answer = new int[4];
            for(char c : str.toCharArray()){
                if(Character.isLowerCase(c))        answer[0]++;
                else if(Character.isUpperCase(c))   answer[1]++;
                else if(Character.isDigit(c))       answer[2]++;
                else                                answer[3]++;
            }
            Arrays.stream(answer).forEach(n -> sb.append(n).append(" "));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
