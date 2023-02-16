import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            answer++;
            if(i+1 == str.length()) break;
            switch(c) {
                case 'c' :
                   if(str.charAt(i+1)== '=' || str.charAt(i+1)== '-') i++;
                   break;
                case 'd' :
                   if(i+2 < str.length() &&str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') i += 2;
                   else if(str.charAt(i+1) == '-')                      i++;
                   break;

                case 'l' :
                case 'n' :
                    if(str.charAt(i+1) == 'j') i++;
                    break;

                case 's' :
                case 'z' :
                    if(str.charAt(i+1) == '=') i++;
                    break;
            }
        }

        System.out.print(answer);

    }
}
