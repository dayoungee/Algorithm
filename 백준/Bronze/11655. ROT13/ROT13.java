
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(char c : br.readLine().toCharArray()){
            int n = Character.isLowerCase(c) ? 'z' : 'Z';
            if(Character.isLetter(c)){
                if((c += 13) > n){
                    c -= 26;
                }
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
