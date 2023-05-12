
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(), answer = "";
        for(char c : str.toCharArray()){
            int n = 90;
            if(Character.isLowerCase(c)) n = 122;
            if(Character.isLetter(c)){
                if((c += 13) > n){
                    c -= 26;
                }
            }
            answer += c;
        }
        System.out.println(answer);
    }
}
